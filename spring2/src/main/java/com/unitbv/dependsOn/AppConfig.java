package com.unitbv.dependsOn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public BeanC beanC() {
        return new BeanC();
    }
    @Bean
    @DependsOn({"beanC"})
    public BeanB beanB() {
        return new BeanB();
    }
    @Bean
    @DependsOn({"beanB"})
    public BeanA beanA() {
        return new BeanA();
    }

}
