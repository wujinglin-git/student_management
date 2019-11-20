package com.wjl.student_management.entity;

/**
 * @Author: wugege
 * @Date: 2019/10/12 9:57
 * 一给窝哩 giao giao 呀吼
 * 4
 */
public class User {
    private String username;
    private String password;
    private int schoolId;
    private int role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
