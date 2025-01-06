//package com.example.casem4.service.Cart;
//
//import com.example.casem4.model.Cart;
//import com.example.casem4.repository.ICartRepository;
//import com.example.casem4.service.Cart.imple.ICartService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CartService implements ICartService {
//    @Autowired
//    private ICartRepository cartRepository;
//    @Override
//    public Cart findByUserId(Long userId) {
//        return cartRepository.findByUserId(userId);
//    }
//
//    @Override
//    public Cart savePhoneToCart(Cart cart) {
//        return cartRepository.savePhoneToCart(cart);
//    }
//}
