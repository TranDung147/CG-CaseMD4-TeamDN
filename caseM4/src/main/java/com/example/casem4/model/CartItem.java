package com.example.casem4.model;

import jakarta.persistence.*;
@Entity
@Table(name = "cartItem")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cartItemId;

    @ManyToOne
    @JoinColumn(name = "cartId", referencedColumnName = "cartId")
    private Cart cartId;

    @ManyToOne
    @JoinColumn(name = "phoneId", referencedColumnName = "phoneId")
    private Phone phoneId;

    private Integer quantity;
    private Double price;
    private Double TotalPrice;

    public CartItem() {
    }

    public Integer getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(Integer cartItemId) {
        this.cartItemId = cartItemId;
    }

    public Cart getCart() {
        return cartId;
    }

    public void setCart(Cart cart) {
        this.cartId = cart;
    }

    public Phone getPhone() {
        return phoneId;
    }

    public void setPhone(Phone phone) {
        this.phoneId = phone;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        TotalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemId=" + cartItemId +
                ", cartId=" + cartId +
                ", phoneId=" + phoneId +
                ", quantity=" + quantity +
                ", price=" + price +
                ", TotalPrice=" + TotalPrice +
                '}';
    }
}
