package com.example.servletdemo.servlet.filter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:Testcontroller
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 15:10:15
 */
@RestController
@RequestMapping("/test")
public class Testcontroller {
    @RequestMapping(value = "get",method = RequestMethod.GET)
    public String testGet(String userName)
      {
          System.out.println("get使用参数:"+userName);
          return userName;
      }
    @RequestMapping(value = "post",method = RequestMethod.POST)
    public String testPost(String userName)
    {
        System.out.println("post使用参数:"+userName);
        return userName;
    }

}
