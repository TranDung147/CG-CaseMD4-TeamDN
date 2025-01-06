package com.example.casem4.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/admin-home")
    public String showAdminHome() {
        return "Home-Page/admin-home";
    }
}
