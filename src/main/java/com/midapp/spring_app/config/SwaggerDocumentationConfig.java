package com.midapp.spring_app.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Doc API")
                .description("Our First API Doc for Finals ")
                .license("MIT")
                .licenseUrl("https://mit-license.org/")
                .version("0.0.1")
                .contact(new Contact("Fatima Bekmamatova", "https://github.com/Fattijenishbek", "fatima.bekmamatova@iaau.edu.kg"))
                .contact(new Contact("Natalia Klimareva", "https://github.com/MIA1kl", "natalia.klimareva@iaau.edu.kg"))
                .build();
    }

    @Bean
    public Docket custom() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.midapp.spring_app"))
                .build()
                .apiInfo(apiInfo());
    }
}