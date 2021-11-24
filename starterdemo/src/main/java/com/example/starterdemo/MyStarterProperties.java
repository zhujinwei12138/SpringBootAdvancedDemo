package com.example.starterdemo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * FileName:MyStarterProperties
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 17:02:37
 */
@Data
@ConfigurationProperties(prefix = "spring.mystarter")
public class MyStarterProperties {
    private String parameter;
}
