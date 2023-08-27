package com.example.userservice.jpa;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String email;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, unique = true)
    private String userId;
    @Column(nullable = false, unique = true)
    private String encryptedPwd;

    public UserEntity(Long id, String email, String name, String userId, String encryptedPwd) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.userId = userId;
        this.encryptedPwd = encryptedPwd;
    }

    public UserEntity() {}

    public Long getId() {
        return this.id;
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

    public String getEncryptedPwd() {
        return this.encryptedPwd;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setEncryptedPwd(String encryptedPwd) {
        this.encryptedPwd = encryptedPwd;
    }
}
