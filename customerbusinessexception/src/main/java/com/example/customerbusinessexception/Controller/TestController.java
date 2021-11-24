package com.example.customerbusinessexception.Controller;

import com.example.customerbusinessexception.Exception.BusinessException;
import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:TestController
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 13:21:26
 */
@RestController
public class TestController {
    @RequestMapping("/e")
    public String test(@RequestParam("i") Integer i)
    {
        if(i==0)
        {
            throw new BusinessException(600,"自定义业务错误");
        }
        return "success";
    }
}
