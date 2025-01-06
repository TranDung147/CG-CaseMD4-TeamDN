package com.example.casem4.controller.home;

import com.example.casem4.model.Phone;
import com.example.casem4.service.Phone.PhoneService;
import com.example.casem4.service.Phone.imple.IPhoneService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private IPhoneService phoneService;

    @GetMapping("/")
    public String showHomePage(
            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
            @RequestParam(name = "name", required = false, defaultValue = "") String name,
            HttpSession session, Model model) {

        Object user = session.getAttribute("loggedInUser");
        if (user != null) {
            model.addAttribute("isLoggedIn", true);
            model.addAttribute("username", user);
        } else {
            model.addAttribute("isLoggedIn", false);
        }
        Pageable pageable = PageRequest.of(page, 16, Sort.by("name").ascending());
        Page<Phone> phoneList = phoneService.findAll(pageable);
        model.addAttribute("phoneList", phoneList);
        return "Home-Page/home";
    }

    private boolean checkIfUserIsLoggedIn() {
        return false;
    }
}
