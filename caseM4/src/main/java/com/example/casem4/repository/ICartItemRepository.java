package com.example.casem4.repository;

import com.example.casem4.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICartItemRepository extends JpaRepository<CartItem, Integer> {
    @Query("select ci from CartItem ci where ci.cartId = :cartId AND ci.phoneId = :phoneId")
    List<CartItem> findByCartIdAndPhoneId(@Param("cartId") Integer cartId, @Param("phoneId") Integer phoneId);
}
