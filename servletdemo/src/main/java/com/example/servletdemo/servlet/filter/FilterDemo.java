package com.example.servletdemo.servlet.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import org.springframework.core.annotation.Order;

/**
 * FileName:Filterdemo
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 15:02:02
 */
@Order(1)//多个filter，序号越小，越早执行
@WebFilter(filterName = "FilterDemo",urlPatterns = "/tttt")//url过滤配置
public class FilterDemo implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        //init逻辑,该init将在服务器启动时调用
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain)throws IOException, ServletException
    {
        //request处理逻辑，response封装逻辑，chain重新写回request和response
    }
    @Override
    public void destroy()
    {
        //服务器关闭时调用
    }
}
