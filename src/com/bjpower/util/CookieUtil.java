package com.bjpower.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
    public static void addCookie(String cookieName, int time, HttpServletRequest request, HttpServletResponse response, String stu_code, String password) {
        Cookie cookie = getCookieByName(request,cookieName);
        //如果有项目保存Cookie的值则更改cookie的值。否则，则创建一个新的Cookie
        if (cookie != null) {
            cookie.setValue(stu_code+"#"+password);
        }else {
            cookie = new Cookie(cookieName,stu_code+"#"+password);
        }
        //设置Cookie有效时间
        cookie.setMaxAge(time);
        //设置cookie作用范围，只在当前项目范围中有效
        cookie.setPath(request.getContextPath());
        //将其添加到响应头，否则 之前所做的都没意义
        response.addCookie(cookie);
    }

    /**
     * 判断浏览器是否有保存Cookie对象
     * @param request 请求对象
     * @param cookieName cookie的键名
     * @return 如果有保存,则返回:cookie ;否则返回:null
     */
    public static Cookie getCookieByName(HttpServletRequest request, String cookieName) {
        Cookie[] cookies  = request.getCookies();
        if (cookies != null  && cookies.length>0) {
            for (Cookie cookie:cookies){
                return cookie;
            }
        }
        return null;
    }


    public static void removeCookie(HttpServletRequest request,HttpServletResponse response) {
        Cookie cookie = getCookieByName(request,"cookie_name_pass");
        if (cookie != null){
            cookie.setMaxAge(0);
            cookie.setPath(request.getContextPath());
        }
        response.addCookie(cookie);
    }
}
