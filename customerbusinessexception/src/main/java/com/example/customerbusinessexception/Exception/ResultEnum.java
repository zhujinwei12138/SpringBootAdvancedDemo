package com.example.customerbusinessexception.Exception;



/**
 * FileName:ResultEnum
 * Author:zhujinwei
 * Date: 2021年11月23日 0023 13:27:26
 */

public enum ResultEnum {
    UNKNOW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    ERROR(1,"失败");

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    private Integer code;
    private String msg;
    ResultEnum(Integer code,String msg)
    {
        this.code=code;
        this.msg=msg;
    }



}
