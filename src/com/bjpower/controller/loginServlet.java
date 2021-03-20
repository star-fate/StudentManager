package com.bjpower.controller;

import com.bjpower.dao.tb_userDao;
import com.bjpower.entity.tbUser;
import com.bjpower.service.loginService;
import com.bjpower.util.CookieUtil;
import com.mysql.cj.util.EscapeTokenizer;
import com.sun.tools.javac.Main;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取用户输入的用户名和密码
        String stu_code = request.getParameter("stu_code");
        String password = request.getParameter("password");
        String remember = request.getParameter("remember");
        //调用服务层对象，判断密码是否正确
        tbUser user = loginService.login_in(stu_code,password,request);
        //如果成功则
        if (user != null) {
            //保存在session中的数据默认30分钟内有效
            HttpSession session = request.getSession();
            session.setAttribute("user_message",user);
            if (remember != null && "remember_me".equals(remember)) {
                //引用Cookie工具类
                CookieUtil.addCookie("cookie_name_pass",7*24*60*60,request
                        ,response,stu_code,password);
            }
            response.sendRedirect("/myWeb/main.html");
        }else {
            request.setAttribute("error_message","请检查您输入的学号/密码");
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }
    }
}
