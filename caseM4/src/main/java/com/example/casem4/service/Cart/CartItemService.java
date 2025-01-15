package com.example.casem4.service.Cart;

import com.example.casem4.model.Cart;
import com.example.casem4.model.CartItem;
import com.example.casem4.model.Phone;
import com.example.casem4.repository.ICartItemRepository;
import com.example.casem4.repository.ICartRepository;
import com.example.casem4.repository.IPhoneRepository;
import com.example.casem4.service.Cart.imple.ICartItemService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CartItemService implements ICartItemService {
    @Autowired
    private ICartItemRepository cartItemRepository;

    @Autowired
    private ICartRepository cartRepository;

    @Autowired
    private IPhoneRepository phoneRepository;

    @Override
    public void addPhoneToCart(Integer cartId, Integer phoneId, Integer quantity, Double price, Double totalPrice) {
        Cart cart = cartRepository.findByCartId(cartId);
        Phone phone = phoneRepository.findPhoneByPhoneId(phoneId);
        CartItem cartItem = new CartItem();
        cartItem.setCart(cart);
        cartItem.setPhone(phone);
        cartItem.setQuantity(quantity);
        cartItem.setPrice(price);
        cartItem.setTotalPrice(totalPrice);
        if (cart == null)
            throw new RuntimeException("No cart found with ID: " + cartId);
        if (phone == null) {
            throw new RuntimeException("No phone found with ID: " + phoneId);
        }
        CartItem existingItem = cartItemRepository.findByCartIdAndPhoneId(cartId, phoneId);
        if (existingItem != null) {
            existingItem.setQuantity(existingItem.getQuantity() + quantity);
            existingItem.setTotalPrice(existingItem.getPrice() * quantity);
            cartItemRepository.save(existingItem);
        } else {
            cartItem = new CartItem();
            cartItem.setCart(cartRepository.findByCartId(cartId));
            cartItem.setPhone(phone);
            cartItem.setQuantity(quantity);
            cartItem.setPrice(price);
            cartItem.setTotalPrice(price * quantity);
            cartItemRepository.save(cartItem);
        }
    }

    @Override
    public List<CartItem> getCartItems(Integer cartId) {
        return cartItemRepository.findCartItemsByCartId(cartId);
    }

    @Override
    public List<CartItem> getCartItemByCartId(Integer cartId) {
        return cartItemRepository.findCartItemsByCartId(cartId);
    }

    @Override
    public void removeCartItem(Integer cartItemId) {
        if (!cartItemRepository.existsById(cartItemId)) {
            throw new RuntimeException("Cart item not found.");
        }
        cartItemRepository.deleteById(cartItemId);
    }
}
