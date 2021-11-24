package com.example.annotationdemo;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:TestController
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 09:12:37
 */
@RestController
@EnableAspectJAutoProxy
public class TestController {
    @RequestMapping("/")
    @MyTestAnnotation("测试注解")
    public void testannotation()
     {
         System.err.println("测试自定义注解");
     }
}
