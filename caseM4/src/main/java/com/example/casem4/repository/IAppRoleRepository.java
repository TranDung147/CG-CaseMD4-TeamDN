package com.example.casem4.repository;

import com.example.casem4.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppRoleRepository extends JpaRepository<AppRole, Integer> {
    AppRole findByRole(String role);
}
