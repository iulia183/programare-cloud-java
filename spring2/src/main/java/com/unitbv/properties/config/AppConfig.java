package com.unitbv.properties.config;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource("classpath:application.properties")
@Configuration
@RequiredArgsConstructor
public class AppConfig {

    @Value("${model}")
    private String model;

    @Bean
    Car car(){
        return new Car(model);
    }
}
