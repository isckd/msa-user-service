package com.example.userservice.vo;

public class ResponseUser {

    private String email;
    private String name;
    private String userId;

    public ResponseUser(String email, String name, String userId) {
        this.email = email;
        this.name = name;
        this.userId = userId;
    }

    public ResponseUser() {
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
