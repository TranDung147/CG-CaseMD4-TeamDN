package com.example.casem4.repository;

import com.example.casem4.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<Brand, Integer> {
}
