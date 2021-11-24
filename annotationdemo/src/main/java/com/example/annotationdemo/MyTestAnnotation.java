package com.example.annotationdemo;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * FileName:MyTestAnnotation
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 09:11:44
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyTestAnnotation {
    String value();
}
