package com.example.casem4.service.Cart.imple;

import com.example.casem4.model.Cart;
import com.example.casem4.model.CartItem;
import com.example.casem4.model.Phone;

import java.util.List;

public interface ICartItemService {
    void addPhoneToCart(Integer cartId, Integer phoneId, Integer quantity, Double price, Double totalPrice);
    List<CartItem> getCartItems(Integer cartId);
    List<CartItem> getCartItemByCartId(Integer cartId);
    void removeCartItem(Integer cartItemId);
}
