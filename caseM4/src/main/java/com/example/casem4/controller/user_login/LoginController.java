package com.example.casem4.controller.user_login;

import com.example.casem4.model.AppUser;
import com.example.casem4.model.Cart;
import com.example.casem4.model.DTO.AppUserDTO;
import com.example.casem4.service.AppUser.imple.IAppUserService;
import com.example.casem4.service.Cart.imple.ICartService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private IAppUserService appUserService;
    @Autowired
    private ICartService cartService;

    @GetMapping("/login")
    public String showLoginPage(HttpSession session, Model model) {
        String loggedInUser = (String) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            model.addAttribute("isLoggedIn", true);
            model.addAttribute("username", loggedInUser);
        } else {
            model.addAttribute("isLoggedIn", false);
        }
        return "Authen/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("appUserDTO") AppUserDTO appUserDTO, HttpSession session, Model model) {
        try {
            if ("admin".equals(appUserDTO.getUsername()) && "123".equals(appUserDTO.getPassword())) {
                session.setAttribute("loggedInUser", "admin");
                return "redirect:/admin-home";
            }
            boolean isValidUser = appUserService.authenticateUser(appUserDTO.getUsername(), appUserDTO.getPassword());
            if (isValidUser) {
                AppUser user = appUserService.findUserByUsername(appUserDTO.getUsername());
                Cart cart = cartService.getCartByUserId(user.getUserId());
                session.setAttribute("loggedInUser", user.getUsername());
                session.setAttribute("cartId", cart.getCartID());
                return "redirect:/";
            } else {
                model.addAttribute("error", "Tài khoản hoặc mật khẩu không đúng.");
                return "Authen/login";
            }
        } catch (Exception e) {
            model.addAttribute("error", "Đã xảy ra lỗi khi đăng nhập.");
            return "Authen/login";
        }
    }

}