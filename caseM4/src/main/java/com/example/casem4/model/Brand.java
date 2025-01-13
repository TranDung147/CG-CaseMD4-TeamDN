package com.example.casem4.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int brandId;

    private String name;

    @OneToMany(mappedBy = "brand", fetch = FetchType.LAZY)
    private List<Phone> phones;

    public Brand() {
    }

    public Brand(int brandId, String name, List<Phone> phones) {
        this.brandId = brandId;
        this.name = name;
        this.phones = phones;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
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
