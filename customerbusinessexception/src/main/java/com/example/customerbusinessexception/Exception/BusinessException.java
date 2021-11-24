package com.example.customerbusinessexception.Exception;

import lombok.Data;

/**
 * FileName:BusinessException
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 13:21:44
 */
@Data
public class BusinessException extends RuntimeException{
    private Integer code;
    public BusinessException(int code,String msg)
    {
        super(msg);
        this.code=code;
    }

}
