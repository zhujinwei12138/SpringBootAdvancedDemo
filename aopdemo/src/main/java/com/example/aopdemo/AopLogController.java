package com.example.aopdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:AopLogController
 * Author:zhujinwei
 * Date: 2021年11月19日 0019 15:26:13
 */
@RestController
public class AopLogController {
    @GetMapping("/aoptest")
    public String aVoid() {
        return "hello aop test";
    }
}
