package com.example.casem4.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class AppRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int role_id;

    private String role;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<AppUser> users;

    public AppRole() {
    }


    public AppRole(int role_id, String role) {
        this.role_id = role_id;
        this.role = role;
    }

    public AppRole(String role) {
        this.role = role;
    }

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<AppUser> getUsers() {
        return users;
    }

    public void setUsers(List<AppUser> users) {
        this.users = users;
    }
}
