package com.example.casem4.controller.user_login;

import com.example.casem4.service.AppUser.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ForgotPasswordController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping("/forgot-password")
    public String showForgotPasswordPage() {
        return "Authen/forgot-password";
    }

    @PostMapping("/forgot-password")
    public String resetPassword(@RequestParam("email") String email) {
        boolean result = appUserService.resetPassword(email);
        if (result) {
            return "redirect:/login";
        } else {
            return "Authen/forgot-password";
        }
    }
}
