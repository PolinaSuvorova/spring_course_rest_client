package com.polina.spring.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.polina.spring.rest")
public class MyConfig {
    @Bean
    public RestTemplate restTemplate() {
        // метод для запуска http запроса
        return new RestTemplate();
    }
}
