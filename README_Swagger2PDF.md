# swagger-2-pdf

将swagger文档转换成PDF


+ 修改pom
 
修改下面pom中的swaggerInput地址
```xml?linenums
<configuration>
	<swaggerInput>http://localhost:8888/v2/api-docs</swaggerInput>
	<outputDir>src/docs/asciidoc/generated</outputDir>
	<config>
		<swagger2markup.markupLanguage>ASCIIDOC</swagger2markup.markupLanguage>
		<swagger2markup.pathsGroupedBy>TAGS</swagger2markup.pathsGroupedBy>
	</config>
</configuration>
```

+ 生成MarkDown

执行

``` shell?linenums
mvn swagger2markup:convertSwagger2markup
```
生成markdown

+ 生成PDF
 
执行

``` shell?linenums
mvn generate-resources
```
生成pdf文件
