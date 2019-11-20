package com.wjl.student_management.dao.param;

import java.security.PrivateKey;
import java.util.Date;

/**
 * @Author: wugege
 * @Date: 2019/11/4 12:32
 * 一给窝哩 giao giao 呀吼
 * 4
 */
public class StudentParam {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    private String card_id;
    private String sno;
    private String school;
    private String major;


}
