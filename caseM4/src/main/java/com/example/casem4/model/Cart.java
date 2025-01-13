package com.example.casem4.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartId;

    //1 Cart là của 1 User
    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private AppUser appUser;

    //1 Cart có nhiều điện thoại
    @OneToMany(mappedBy = "cartId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CartItem> cartItems = new ArrayList<>();

    public Cart() {
    }

    public Integer getCartID() {
        return cartId;
    }

    public void setCartID(Integer cartId) {
        this.cartId = cartId;
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
