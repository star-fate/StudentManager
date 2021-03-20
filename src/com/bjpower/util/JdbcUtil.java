package com.bjpower.util;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.Iterator;
import java.util.Map;

public class JdbcUtil {
    private static Connection con = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection createCon(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentManagerSystem","root","fate");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return con;
    }
    //通过全局作用域对象得到Connection-- 重载
    public static Connection createCon(HttpServletRequest request) {
        ServletContext application =request.getServletContext();
        Map map = (Map) application.getAttribute("key1");
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            Connection con = (Connection) iterator.next();
            Boolean bollean = (Boolean) map.get(con);
            if (bollean){
                map.put(con,false);
                break;
            }
        }
        return con;
    }
    public static PreparedStatement createPre(String sql) {
        try {
            ps = createCon().prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ps;
    }
    public static PreparedStatement createPre(String sql,HttpServletRequest request) {
        try {
            ps = createCon(request).prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ps;
    }

    public static void close(){
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    public static void close(ResultSet rs){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        close();
    }
    //重载 close 方法
    public static void close(HttpServletRequest request){
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        ServletContext application = request.getServletContext();
        Map map = (Map)application.getAttribute("key1");
        map.put(con,true);
    }
    public static void close(ResultSet rs,HttpServletRequest request){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        close(request);
    }
}
