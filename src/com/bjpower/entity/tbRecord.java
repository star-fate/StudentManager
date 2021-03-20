package com.bjpower.entity;

public class tbRecord {
    private Integer id;
    private Integer student_id;
    private String date;
    private String remark;
    private Integer disable;

    public tbRecord() {
    }

    public tbRecord(Integer id, Integer student_id, String date, String remark, Integer disable) {
        this.id = id;
        this.student_id = student_id;
        this.date = date;
        this.remark = remark;
        this.disable = disable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getDisable() {
        return disable;
    }

    public void setDisable(Integer disable) {
        this.disable = disable;
    }
}
