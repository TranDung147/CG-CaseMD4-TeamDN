package com.example.casem4.service.Cart.imple;

import com.example.casem4.model.AppUser;
import com.example.casem4.model.Cart;

import java.util.List;

public interface ICartService {
    Cart getCartById(Integer cartId);
    Cart createNewCart(AppUser user);
    Cart getCartByUserId(Integer userId);
}
