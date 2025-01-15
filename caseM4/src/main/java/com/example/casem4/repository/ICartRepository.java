package com.example.casem4.repository;

import com.example.casem4.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICartRepository extends JpaRepository<Cart, Integer> {
    @Query("SELECT c from Cart c where c.cartId = :cartId" )
    Cart findByCartId(@Param("cartId") Integer cartId);

    @Query(value = "SELECT * FROM cart WHERE user_id = :userId", nativeQuery = true)
    Cart findCartsByUserId(@Param("userId") Integer userId);

}
