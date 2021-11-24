package com.example.starterdemo;

/**
 * FileName:MyStarter
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 17:01:49
 */
public class MyStarter {
    private MyStarterProperties myStarterProperties;
    public MyStarter()
    {

    }
    public MyStarter(MyStarterProperties myStarterProperties)
    {
        this.myStarterProperties=myStarterProperties;
    }
    public String print()
    {
        System.out.println("参数： "+myStarterProperties.getParameter());
        String s=myStarterProperties.getParameter();
        return s;
    }
}
