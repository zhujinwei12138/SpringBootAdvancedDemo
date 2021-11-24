package com.example.iocdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName:UserConfig
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 14:51:26
 */
@Configuration
public class UserConfig {
    @Bean("user1")
    public User getuser() {
        User user = new User();
        user.setId(1);
        user.setName("zhujinwei");
        return user;
    }
}
