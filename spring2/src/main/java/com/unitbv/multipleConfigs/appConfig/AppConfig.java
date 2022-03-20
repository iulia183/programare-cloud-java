package com.unitbv.multipleConfigs.appConfig;

import com.unitbv.multipleConfigs.BeanA;
import com.unitbv.multipleConfigs.BeanB;
import com.unitbv.multipleConfigs.ConfigA;
import com.unitbv.multipleConfigs.ConfigB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.unitbv.multipleConfigs.appConfig")
public class AppConfig {

    @Bean(name = "beanA")
    BeanA getBeanA() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigA.class) ;
        BeanA beanA = context.getBean("beanA", BeanA.class);
        context.close();
        return beanA;
    }
    @Bean(name = "beanB")
    BeanB getBeanB() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigB.class) ;
        BeanB beanB = context.getBean("beanB", BeanB.class);
        context.close();
        return beanB;
    }

}
