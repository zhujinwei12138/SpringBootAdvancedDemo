package com.example.servletdemo.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebListener;
import java.io.IOException;

/**
 * FileName:EncoderFilter
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 15:17:53
 */
@WebFilter()
public class EncoderFilter implements Filter {
@Override
    public void destroy()
{
    System.out.println("销毁过滤器");
}
@Override
public void doFilter(ServletRequest request, ServletResponse resposne, FilterChain filter)
        throws IOException, ServletException {
		/*HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("sessionId\t"+req.getSession().getId());
		System.out.println(req.getRemoteAddr()+"设定编码");*/
    //设定编码
    request.setCharacterEncoding("UTF-8");
    resposne.setCharacterEncoding("UTF-8");
    filter.doFilter(request, resposne);
}

    @Override
    public void init(FilterConfig filter) throws ServletException {
        //画面初期化
    }
}
