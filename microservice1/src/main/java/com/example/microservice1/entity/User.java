package com.example.microservice1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // 表示这个类是一个JPA实体类，会映射到数据库中的表
public class User {

    @Id // 标注主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自动生成ID
    private Long user_id;
    private String first;
    private String last;
    private String email;
    private String password;
    private Long role_id;

    // Getters and Setters
    public Long getId() {
        return user_id;
    }

    public void setId(Long id) {
        this.user_id = user_id;
    }

    public String getFirst() {
        return first;
    }

    public void setFisrt(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getRole() {
        return role_id;
    }

    public void setRole(Long role_id) {
        this.role_id = role_id;
    }
}
