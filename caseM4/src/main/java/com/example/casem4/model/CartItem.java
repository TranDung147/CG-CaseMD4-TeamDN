package com.example.casem4.model;

import jakarta.persistence.*;
@Entity
@Table(name = "cart_item")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "cart_id", referencedColumnName = "cart_id")
    private Cart cart_id;

    @ManyToOne
    @JoinColumn(name = "phone_id", referencedColumnName = "phone_id")
    private Phone phone;

    private Integer quantity;
    private Long price;
    private Long TotalPrice;

    public CartItem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart_id;
    }

    public void setCart(Cart cart) {
        this.cart_id = cart;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        TotalPrice = totalPrice;
    }
}
