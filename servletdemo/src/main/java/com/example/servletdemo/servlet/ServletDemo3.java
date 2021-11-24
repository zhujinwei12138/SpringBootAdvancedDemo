package com.example.servletdemo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * FileName:ServletDemo3
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 15:18:20
 */

@WebServlet(urlPatterns = "/ServletDemo3/*")
public class ServletDemo3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");

        resp.setContentType("UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html lang=\"zh-CN\">");
        out.println("<head>");
        out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\">");
        out.println("<title>Hello World</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("我是中文");
        out.println("<p>get 方法</p>");
        out.println("</body>");
        out.println("</html>");
        out.flush();
    }
}
