package com.unitbv.profiles.stereotype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    DevDataSourceConfig devDataSourceConfig()
    {
        return new DevDataSourceConfig();
    }

    @Bean
    ProdDataSourceConfig prodDataSourceConfig()
    {
        return new ProdDataSourceConfig();
    }

}
