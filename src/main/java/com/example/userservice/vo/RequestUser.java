package com.example.userservice.vo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RequestUser {

    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than two characters")
    @Email
    private String email;

    @NotNull(message = "Name cannot be null")
    @Size(min = 2, message = "Name not be less than two characters")
    private String name;

    @NotNull(message = "Password cannot be null")
    @Size(min = 8, message = "Password must be equal greater than 8 characters")
    private String pwd;


    public RequestUser(String email, String name, String pwd) {
        this.email = email;
        this.name = name;
        this.pwd = pwd;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public String getPwd() {
        return this.pwd;
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
}
