package com.example.casem4.repository;

import com.example.casem4.model.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IAppUserDetailRepository extends JpaRepository<UserDetail, Integer> {
    UserDetail findByEmail(String email);
    @Query("SELECT u FROM UserDetail u WHERE u.id <= :id")
    List<UserDetail> findByIdLessThanEqual(@Param("id") int id);
}
