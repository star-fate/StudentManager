package com.bjpower.entity;


public class tbManageDormbuild {
    private Integer id;
    private Integer user_id;
    private Integer dormBuild_id;

    public tbManageDormbuild() {
    }

    public tbManageDormbuild(Integer id, Integer user_id, Integer dormBuild_id) {
        this.id = id;
        this.user_id = user_id;
        this.dormBuild_id = dormBuild_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getDormBuild_id() {
        return dormBuild_id;
    }

    public void setDormBuild_id(Integer dormBuild_id) {
        this.dormBuild_id = dormBuild_id;
    }
}
