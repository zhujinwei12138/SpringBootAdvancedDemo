package com.example.iocdemo;

import lombok.Data;

import java.io.Serializable;

/**
 * FileName:User
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 14:51:13
 */
@Data
public class User implements Serializable {
    private long id;
    private String name;
}
