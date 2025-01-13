package com.example.casem4.service.Cart;

import com.example.casem4.model.AppUser;
import com.example.casem4.model.Cart;
import com.example.casem4.repository.ICartRepository;
import com.example.casem4.service.Cart.imple.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService implements ICartService {

    @Autowired
    private ICartRepository cartRepository;

    @Override
    public List<Cart> getCartById(Integer cartId) {
        return cartRepository.findByCartId(cartId);
    }

    @Override
    public Cart createNewCart(AppUser user) {
        Cart newCart = new Cart();
        newCart.setUser(new AppUser());
        return cartRepository.save(newCart);
    }

}
