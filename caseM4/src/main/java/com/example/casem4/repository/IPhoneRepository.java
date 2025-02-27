package com.example.casem4.repository;

import com.example.casem4.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPhoneRepository extends JpaRepository<Phone, Integer> {
    @Query(value = "select p from Phone p join fetch p.brand")
    Page<Phone> findAll(Pageable pageable);
    Page<Phone> findByNameContainingIgnoreCase(String name, Pageable pageable);
    Phone findPhoneByPhoneId(Integer phoneId);
    // Tìm kiếm điện thoại theo tên
    @Query("SELECT p FROM Phone p WHERE p.name LIKE %?1%")
    Page<Phone> searchPhones(String search, Pageable pageable);
}
