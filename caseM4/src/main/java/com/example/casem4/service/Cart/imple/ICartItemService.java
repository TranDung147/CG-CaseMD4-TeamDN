package com.example.casem4.service.Cart.imple;

import com.example.casem4.model.CartItem;

import java.util.List;

public interface ICartItemService {
    CartItem addPhoneToCart(Integer cartId, Integer phoneId, Integer quantity);
    List<CartItem> getCartItems(Integer cartId, Integer phoneId);
}
