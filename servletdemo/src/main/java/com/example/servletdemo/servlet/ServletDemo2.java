package com.example.servletdemo.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * FileName:ServletDemo2
 * Author:zhujinwei
 * Date: 2021年11月22日 0022 15:18:14
 */
@WebServlet(urlPatterns = "/ServletDemo2/*")
public class ServletDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");

        resp.getWriter().print("Servlet Response");
    }
}
