package com.unitbv.profiles.stereotype;

import org.springframework.context.annotation.Profile;

@Profile("prod")
public class ProdDataSourceConfig implements DataSourceConfig {
    @Override
    public void setup() {

    }
}
