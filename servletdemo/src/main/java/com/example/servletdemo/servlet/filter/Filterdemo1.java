package com.example.servletdemo.servlet.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * FileName:Filterdemo1
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 15:08:40
 */
@WebFilter(urlPatterns = "/*")
public class Filterdemo1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("拦截之前");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("拦截之后");
    }
    @Override
    public void destroy() {

    }
}
