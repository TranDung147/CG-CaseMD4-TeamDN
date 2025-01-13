package com.example.casem4.service.Cart;

import com.example.casem4.model.Cart;
import com.example.casem4.model.CartItem;
import com.example.casem4.model.Phone;
import com.example.casem4.repository.ICartItemRepository;
import com.example.casem4.repository.ICartRepository;
import com.example.casem4.repository.IPhoneRepository;
import com.example.casem4.service.Cart.imple.ICartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartItemService implements ICartItemService {
    @Autowired
    private ICartItemRepository cartItemRepository;

    @Autowired
    private ICartRepository cartRepository;

    @Autowired
    private IPhoneRepository phoneRepository;


    @Override
    public CartItem addPhoneToCart(Integer cartId, Integer phoneId, Integer quantity) {
        List<Cart> cart = cartRepository.findByCartId(cartId);
        if (cart.isEmpty())
            throw new RuntimeException("No cart found with ID: " + cartId);
        Phone phone = phoneRepository.findPhoneByPhoneId(phoneId);
        if (phone == null) {
            throw new RuntimeException("No phone found with ID: " + phoneId);
        }

        List<CartItem> existingItems = cartItemRepository.findByCartIdAndPhoneId(cartId, phoneId);
        if (!existingItems.isEmpty()) {
            CartItem existingItem = existingItems.get(0);
            existingItem.setQuantity(existingItem.getQuantity() + quantity);
            return cartItemRepository.save(existingItem);
        } else {
            CartItem cartItem = new CartItem();
            cartItem.setCart(cart.get(0));
            cartItem.setPhone(phone);
            cartItem.setQuantity(quantity);
            return cartItemRepository.save(cartItem);
        }
    }

    @Override
    public List<CartItem> getCartItems(Integer cartId, Integer phoneId) {
        return cartItemRepository.findByCartIdAndPhoneId(cartId, phoneId);
    }
}
