package com.example.iocdemo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * FileName:IocTest
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 14:52:52
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class IocTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testIoC() {
        //实例化User对象，通过上下文获取Bean对象user1
        User user = (User) applicationContext.getBean("user1");
        //在控制台中打印User数据
        System.out.println(user);
    }
}
