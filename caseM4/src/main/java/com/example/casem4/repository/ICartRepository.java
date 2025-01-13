package com.example.casem4.repository;

import com.example.casem4.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICartRepository extends JpaRepository<Cart, Integer> {
    @Query("SELECT c from Cart c where c.cartId = :cartId" )
    List<Cart> findByCartId(@Param("cartId") Integer cartId);
}
