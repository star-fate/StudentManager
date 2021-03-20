package com.bjpower.entity;

public class tbUser {
    private Integer id;
    private String name;
    private String password;
    private String stu_code;
    private String dorm_code;
    private String sex;
    private String tel;
    private Integer dormBuildId;
    private Integer role_id;
    private Integer create_user_id;
    private Integer disabled;

    private tbBuilder dormBuild;
    public tbUser() {
    }

    public tbUser(Integer id, String name, String password, String stu_code, String dorm_code, String sex, String tel, Integer dormBuildId, Integer role_id, Integer create_user_id, Integer disabled, tbBuilder dormBuild) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.stu_code = stu_code;
        this.dorm_code = dorm_code;
        this.sex = sex;
        this.tel = tel;
        this.dormBuildId = dormBuildId;
        this.role_id = role_id;
        this.create_user_id = create_user_id;
        this.disabled = disabled;
        this.dormBuild = dormBuild;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStu_code() {
        return stu_code;
    }

    public void setStu_code(String stu_code) {
        this.stu_code = stu_code;
    }

    public String getDorm_code() {
        return dorm_code;
    }

    public void setDorm_code(String dorm_code) {
        this.dorm_code = dorm_code;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getDormBuildId() {
        return dormBuildId;
    }

    public void setDormBuildId(Integer dormBuildId) {
        this.dormBuildId = dormBuildId;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(Integer create_user_id) {
        this.create_user_id = create_user_id;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public tbBuilder getDormBuild() {
        return dormBuild;
    }

    public void setDormBuild(tbBuilder dormBuild) {
        this.dormBuild = dormBuild;
    }
}
