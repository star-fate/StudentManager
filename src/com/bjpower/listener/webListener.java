package com.bjpower.listener;

import com.bjpower.util.JdbcUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.*;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class webListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public webListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed). 
         You can initialize servlet context related data here.
      */

        Map map = new HashMap();
        Connection con = null;
        for (int i = 0; i < 10; i++) {
            con = JdbcUtil.createCon();
            map.put(con,true);
            System.out.println("在Http服务器启动时，创建了一个Connection--->" + con);
        }
        //获取全局作用域对象
        ServletContext application = sce.getServletContext();
        //将map添加到全局作用域对象
        application.setAttribute("key1",map);
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
        ServletContext application = sce.getServletContext();
        Map map = (Map) application.getAttribute("key1");
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println("Http服务器停止运行："+iterator.next() + " 即将被销毁");
        }
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute 
         is added to a session.
      */
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attribute
         is replaced in a session.
      */
    }
}
