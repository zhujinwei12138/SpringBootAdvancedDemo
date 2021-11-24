package com.example.starterdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName:MyStarterServiceAutoConfiguration
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 17:04:48
 */
@Configuration
@EnableConfigurationProperties(MyStarterProperties.class)
@ConditionalOnClass(MyStarter.class)
@ConditionalOnProperty(prefix = "spring.mystarter",value = "enabled",matchIfMissing = true)
public class MyStarterServiceAutoConfiguration {
    @Autowired
    private MyStarterProperties myStarterProperties;
    @Bean
    @ConditionalOnMissingBean(MyStarter.class)
    public MyStarter MyStarterService()
    {
        MyStarter myStarter=new MyStarter(myStarterProperties);
        return myStarter;
    }
}
