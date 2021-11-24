package com.example.servletdemo.servlet.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * FileName:listenerdemo1
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 15:12:49
 */
@WebListener
public class listenerdemo1 implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent)
{
    System.out.println("MyListener sessionCreated-----");
}
    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent)
    {
        System.out.println("MyListener sessionDestroyed-----");
    }
}
