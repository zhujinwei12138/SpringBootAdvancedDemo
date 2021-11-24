package com.example.customerbusinessexception.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * FileName:CustomerBusinessExceptionHandler
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 13:22:25
 */
@ControllerAdvice
public class CustomerBusinessExceptionHandler {
    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public Map<String,Object> businesshandler(BusinessException e)
    {
        Map<String,Object> map=new HashMap<>();
        map.put("code",e.getCode());
        map.put("msg",e.getMessage());
        return map;
    }
}
