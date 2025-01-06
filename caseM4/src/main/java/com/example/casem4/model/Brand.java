package com.example.casem4.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int brand_id;

    private String name;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private List<Phone> phones;

    public Brand() {
    }

    public Brand(int brand_id, String name, List<Phone> phones) {
        this.brand_id = brand_id;
        this.name = name;
        this.phones = phones;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
}
