package com.bjpower.service;

import com.bjpower.dao.tb_userDao;
import com.bjpower.entity.tbUser;

import javax.servlet.http.HttpServletRequest;

public class loginService {
    public static tbUser login_in(String stu_code, String inputPassword, HttpServletRequest request){
        if ((stu_code != null && !"".equals(stu_code)) && (inputPassword != null && !"".equals(inputPassword))) {
            tbUser result = tb_userDao.checkPassword(stu_code,inputPassword,request);
            if (result != null){
                return result;
            }
        }
        return null;
    }
}
