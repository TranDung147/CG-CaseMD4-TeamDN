package com.example.casem4.controller.admin;

import com.example.casem4.model.UserDetail;
import com.example.casem4.service.AppUser.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/admin-home")
public class UserManagerController {

    @Autowired
    private AppUserService userDetailService;

    @GetMapping("/user-management")
    public String viewUserList(Model model) {
        List<UserDetail> userList = userDetailService.getUserDetailsFromId(3)
                .stream()
                .filter(user -> user.getId() != 1)
                .collect(Collectors.toList());
        model.addAttribute("users", userList);
        return "Admin/user-management";
    }

    @PostMapping("/user-management/add-user")
    public String addUser(@ModelAttribute UserDetail userDetail) {
        userDetailService.saveUser(userDetail);
        return "redirect:/admin-home/user-management";
    }
    @GetMapping("/user-management/add-user")
    public String showAddUserForm() {
        return "Admin/add-user";
    }
    @PostMapping("/delete")
    public String deleteUser(@RequestParam Long id) {
        userDetailService.deleteUser(id.intValue());
        return "redirect:/admin-home/user-management";
    }
}
