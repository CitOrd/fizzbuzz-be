package com.ibm.emeahrithu.fizzbuzz.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import lombok.SneakyThrows;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class OpenApiConfig {

    @Bean
    @SneakyThrows
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(
                new Info().title("Fizz Buzz API")
        );
    }

}