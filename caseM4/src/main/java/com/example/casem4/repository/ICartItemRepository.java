package com.example.casem4.repository;

import com.example.casem4.model.Cart;
import com.example.casem4.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICartItemRepository extends JpaRepository<CartItem, Integer> {
    @Query(value = "SELECT * FROM cart_item ci WHERE ci.cart_id = :cartId AND ci.phone_id = :phoneId", nativeQuery = true)
    CartItem findByCartIdAndPhoneId(@Param("cartId") Integer cartId, @Param("phoneId") Integer phoneId);

    @Query(value = "SELECT * FROM cart c INNER JOIN cart_item ci ON c.cart_id = ci.cart_id WHERE c.user_id = :userId", nativeQuery = true)
    List<CartItem> findCartDetailsByUserId(@Param("userId") Integer userId);

    @Query(value = "SELECT * FROM cart_item ci WHERE ci.cart_id = :cartId", nativeQuery = true)
    List<CartItem> findCartItemsByCartId(@Param("cartId") Integer cartId);

}
