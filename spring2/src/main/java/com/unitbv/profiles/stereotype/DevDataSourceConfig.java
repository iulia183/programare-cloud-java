package com.unitbv.profiles.stereotype;


import org.springframework.context.annotation.Profile;

@Profile("dev & default")
public class DevDataSourceConfig implements DataSourceConfig {
    @Override
    public void setup() {

    }
}
