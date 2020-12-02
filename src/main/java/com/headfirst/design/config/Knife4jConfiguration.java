package com.headfirst.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author LiuCan
 * @date 2020/12/2 13:59
 * @description Knife4jConfiguration
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {
    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .contact(new Contact("Lim Lau" , "https://github.com/Lim-Lau" , "simpleasy@gmail.com.cn"))
                        //.title("swagger-bootstrap-ui-demo RESTful APIs")
                        .description("# Head First 4 Design!")
                        .termsOfServiceUrl("https://headfirst4design.lim.com/")
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("HeadFirst4DesignV1.0")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.headfirst.design.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
