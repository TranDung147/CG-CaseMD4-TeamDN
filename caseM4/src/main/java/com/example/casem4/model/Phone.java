package com.example.casem4.model;

import jakarta.persistence.*;

@Entity
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer capacity;

    private Integer ram;

    private String color;

    private Double price;

    private String origin;
    private String imgURL;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    public Phone() {
    }

    public Phone(Integer id, String name, Integer capacity, Integer ram, String color, Double price, String origin, Brand brand, String imgURL) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.ram = ram;
        this.color = color;
        this.price = price;
        this.origin = origin;
        this.brand = brand;
        this.imgURL = imgURL;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capacity=" + capacity +
                ", ram=" + ram +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", origin='" + origin + '\'' +
                ", imgURL='" + imgURL + '\'' +
                ", brand=" + brand +
                '}';
    }
}
