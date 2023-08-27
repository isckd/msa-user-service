package com.example.userservice.dto;

import java.util.Date;

public class UserDto {

    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createdAt;

    private String encryptedPwd;

    public UserDto(String email, String name, String pwd, String userId, Date createdAt, String encryptedPwd) {
        this.email = email;
        this.name = name;
        this.pwd = pwd;
        this.userId = userId;
        this.createdAt = createdAt;
        this.encryptedPwd = encryptedPwd;
    }

    public UserDto() {}

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getPwd() {
        return this.pwd;
    }

    public String getUserId() {
        return this.userId;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public String getEncryptedPwd() {
        return this.encryptedPwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setEncryptedPwd(String encryptedPwd) {
        this.encryptedPwd = encryptedPwd;
    }
}
