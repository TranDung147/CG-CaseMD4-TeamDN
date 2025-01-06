package com.example.casem4.repository;

import com.example.casem4.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
//    AppUser findByPhone (Integer phone);
}
