package com.example.unittest.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:HelloController
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 14:05:46
 */
@RestController
public class HelloController {
@RequestMapping("/hello")
    public String hello(String name)
{
    return "hello "+name;
}
}
