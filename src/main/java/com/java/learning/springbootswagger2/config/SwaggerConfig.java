package com.java.learning.springbootswagger2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket githubApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Github").apiInfo(githubApiInfo())
				.useDefaultResponseMessages(false).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.regex(".*github.*")).build();
	}

	@Bean
	ApiInfo githubApiInfo() {
		return new ApiInfoBuilder().title("Github").description("APIs used to retrive data from Github").build();
	}
}