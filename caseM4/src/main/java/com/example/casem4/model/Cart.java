package com.example.casem4.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cart_id;

    //1 Cart là của 1 User
    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private AppUser appUser;

    //1 Cart có nhiều điện thoại
    @OneToMany(mappedBy = "cart_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CartItem> cartItems = new ArrayList<>();

    public Cart() {
    }

    public Integer getCartID() {
        return cart_id;
    }

    public void setCartID(Integer cart_id) {
        this.cart_id = cart_id;
    }

    public AppUser getUser() {
        return appUser;
    }

    public void setUser(AppUser user) {
        this.appUser = user;
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
