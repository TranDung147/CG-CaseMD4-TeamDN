package com.example.casem4.repository;

import com.example.casem4.model.Orderr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Orderr, Integer> {
}
