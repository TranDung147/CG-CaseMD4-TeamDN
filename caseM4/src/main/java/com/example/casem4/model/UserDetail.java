package com.example.casem4.model;

import jakarta.persistence.*;

@Entity
public class UserDetail {

    // Sử dụng @Id để chỉ định cột khóa chính
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Thêm tự động tăng cho id
    private Long id;

    private String name;
    private String address;
    private String email;
    private Integer phone;

    // Mối quan hệ OneToOne với AppUser
    @OneToOne
    @JoinColumn(name = "user_id")  // Cột khóa ngoại tham chiếu tới AppUser
    private AppUser appUser;

    public UserDetail() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }
}
