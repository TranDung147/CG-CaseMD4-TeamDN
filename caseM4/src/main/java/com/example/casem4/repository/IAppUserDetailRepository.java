package com.example.casem4.repository;

import com.example.casem4.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserDetailRepository extends JpaRepository<UserDetail, Integer> {
    UserDetail findByEmail(String email);
}
