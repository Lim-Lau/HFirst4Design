package com.headfirst.design.config;


import com.github.xiaoymin.knife4j.spring.extension.OpenApiExtensionResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author LiuCan
 * @date 2020/12/2 14:31
 * @description SwaggerConfiguration
 */
@Configuration
@EnableSwagger2WebMvc
public class SwaggerConfiguration {
    /**
     * @author LiuCan
     * 引入Knife4j提供的扩展类
     */
    private final OpenApiExtensionResolver openApiExtensionResolver;

    @Autowired
    public SwaggerConfiguration(OpenApiExtensionResolver openApiExtensionResolver) {
        this.openApiExtensionResolver = openApiExtensionResolver;
    }

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        String groupName = "HeadFirst4DesignV1.0";

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .host("https://headfirst4design.lim.com/")
                .apiInfo(apiInfo())
                .groupName(groupName)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.headfirst.design.controller"))
                .paths(PathSelectors.any())
                .build()
                //赋予插件体系
                .extensions(openApiExtensionResolver.buildSettingExtensions())
                .extensions(openApiExtensionResolver.buildExtensions(groupName));

        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .contact(new Contact("Lim Lau", "https://github.com/Lim-Lau", "simpleasy@gmail.com.cn"))
                //.title("swagger-bootstrap-ui-demo RESTful APIs")
                .description("# Head First 4 Design")
                .termsOfServiceUrl("https://headfirst4design.lim.com/")
                .version("1.0")
                .build();
    }
}
