package com.example.casem4.service.AppUser.imple;

import com.example.casem4.model.AppUser;
import com.example.casem4.model.DTO.AppUserDTO;

public interface IAppUserService {
    boolean authenticateUser(String username, String password);
    boolean registerUser(AppUserDTO appUserDTO);
    boolean resetPassword(String email);
    AppUser findUserByUsername(String username);
}