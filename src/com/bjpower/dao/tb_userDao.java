package com.bjpower.dao;

import com.bjpower.entity.tbUser;
import com.bjpower.util.JdbcUtil;

import javax.servlet.http.HttpServletRequest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class tb_userDao {
    //验证用户密码
    public static tbUser checkPassword(String stu_code, String password, HttpServletRequest request){
        tbUser user = null;
        String sql = "select * from tb_user where stu_code = ? and password = ?";
        ResultSet rs = null;
        PreparedStatement ps = JdbcUtil.createPre(sql,request);
        try {
            ps.setString(1,stu_code);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if(rs.next()){
                user = new tbUser();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setStu_code(rs.getString(4));
                user.setDorm_code(rs.getString(5));
                user.setSex(rs.getString(6));
                user.setTel(rs.getString(7));
                user.setDormBuildId(rs.getInt(8));
                user.setRole_id(rs.getInt(9));
                user.setCreate_user_id(rs.getInt(10));
                user.setDisabled(rs.getInt(11));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

}
