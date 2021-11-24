package com.example.servletdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.annotation.WebListener;

@ServletComponentScan
@SpringBootApplication
public class ServletdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServletdemoApplication.class, args);
    }

}
