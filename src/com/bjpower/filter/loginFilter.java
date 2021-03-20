package com.bjpower.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class loginFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // session
        HttpServletRequest request = (HttpServletRequest) req;
        HttpSession session = null;
        String uri = request.getRequestURI();
        //内部包含 login
        if(uri.indexOf("login")!=-1 || "/myWeb/".equals(uri)){
            chain.doFilter(req, resp);
            return;
        }
        session  = request.getSession(false);
        if (session != null && session.getAttribute("user_message") != null) {
            System.out.println(session);
            chain.doFilter(req, resp);
            return;
        }
        request.getRequestDispatcher("/login.html").forward(req,resp);
    }
}
