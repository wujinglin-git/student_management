package com.wjl.student_management.entity;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: wugege
 * @Date: 2019/10/12 17:35
 * 一给窝哩 giao giao 呀吼
 * 4
 */

public class School {
    private int id;
    private String schName;
    private String schAddr;
    private String schTel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName;
    }

    public String getSchAddr() {
        return schAddr;
    }

    public void setSchAddr(String schAddr) {
        this.schAddr = schAddr;
    }

    public String getSchTel() {
        return schTel;
    }

    public void setSchTel(String schTel) {
        this.schTel = schTel;
    }
}
