package com.example.casem4.model;

import jakarta.persistence.*;
@Entity
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String address;

    private String email;

    private Integer phone;

    @OneToOne(mappedBy = "userDetail", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private AppUser appUser;

    public UserDetail() {}
    public UserDetail(int id, String name, String address, String email, Integer phone) {

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

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
