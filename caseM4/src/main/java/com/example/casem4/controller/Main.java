package com.example.casem4.controller;

import com.example.casem4.model.CartItem;
import com.example.casem4.service.Cart.CartItemService;
import com.example.casem4.service.Cart.imple.ICartItemService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Test the addPhoneToCart method
        ICartItemService cartItemService = new CartItemService();
        Integer cartId = 2;
        Integer phoneId = 4;
        Integer quantity = 2;
        CartItem cartItem = cartItemService.addPhoneToCart(cartId, phoneId, quantity);
        System.out.println("Added cart item: " + cartItem);

        // Test the getCartItems method
        List<CartItem> cartItems = cartItemService.getCartItems(cartId, phoneId);
        System.out.println("Cart items for cart ID " + cartId + " and phone ID " + phoneId + ":");
        for (CartItem item : cartItems) {
            System.out.println(item);
        }
    }
}
