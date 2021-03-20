package com.bjpower.controller;

import com.bjpower.util.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class loginOutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //清除当前浏览器保存在session中的信息
        request.getSession().removeAttribute("user_message");
        //清除浏览器保存在cookie中的信息
        CookieUtil.removeCookie(request,response);
        response.sendRedirect("/myWeb/login.jsp");
    }
}
