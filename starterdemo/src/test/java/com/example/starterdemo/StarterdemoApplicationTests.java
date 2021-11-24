package com.example.starterdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StarterdemoApplicationTests {


    @Test
    public void contextLoads() {
    }
    @Autowired
    private MyStarter myStarterService;

    @Test
    public void hello() {
        System.out.println(myStarterService.print());
    }

}
