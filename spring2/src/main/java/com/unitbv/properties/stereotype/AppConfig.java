package com.unitbv.properties.stereotype;

import com.unitbv.properties.stereotype.Car;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
@ComponentScan
public class AppConfig {

    @Bean
    public Car car(){
        return new Car();
    }
}
