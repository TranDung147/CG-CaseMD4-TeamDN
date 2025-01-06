package com.example.casem4.controller.user_login;

import com.example.casem4.model.AppUserDTO;
import com.example.casem4.service.AppUser.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping("/register")
    public String showRegisterPage(Model model) {
        model.addAttribute("appUserDTO", new AppUserDTO());
        return "Authen/register";
    }
///swagger
@PostMapping("/register")
public String register(@ModelAttribute("appUserDTO") AppUserDTO appUserDTO, Model model) {
    List<String> errors = new ArrayList<>();

    if (appUserService.checkUserByUsername(appUserDTO.getUsername())) {
        errors.add("Username đã tồn tại trong hệ thống.");
    }

    if (appUserService.checkUserByEmail(appUserDTO.getEmail())) {
        errors.add("Email đã tồn tại trong hệ thống.");
    }

    if (appUserDTO.getPassword().length() < 6) {
        errors.add("Mật khẩu phải có ít nhất 6 ký tự.");
    }

    if (!errors.isEmpty()) {
        model.addAttribute("errors", errors);
        return "Authen/register";
    }

    boolean isRegistered = appUserService.registerUser(appUserDTO);
    if (isRegistered) {
        return "redirect:/login?success";
    } else {
        model.addAttribute("errors", Collections.singletonList("Đã có lỗi xảy ra khi đăng ký. Vui lòng thử lại."));
        return "Authen/register";
    }
}


}
