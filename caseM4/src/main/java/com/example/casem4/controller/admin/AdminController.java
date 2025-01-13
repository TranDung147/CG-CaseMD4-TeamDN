package com.example.casem4.controller.admin;

import com.example.casem4.model.Brand;
import com.example.casem4.model.DTO.PhoneDTO;
import com.example.casem4.model.Phone;
import com.example.casem4.model.UserDetail;
import com.example.casem4.service.AppUser.AppUserService;
import com.example.casem4.service.Brand.BrandService;
import com.example.casem4.service.Phone.PhoneService;
import com.example.casem4.service.Phone.imple.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {

    private final AppUserService userDetailService;
    private final BrandService brandService;

    @Autowired
    public AdminController(AppUserService userDetailService, BrandService brandService, PhoneService phoneService) {
        this.userDetailService = userDetailService;
        this.brandService = brandService;
    }

    @GetMapping("/admin-home")
    public String showAdminHome() {
        return "Home-Page/admin-home";
    }

    @GetMapping("/admin-home/profile-admin")
    public String viewProfileAdmin(Model model) {
        UserDetail userDetail = userDetailService.getUserDetailById(1);
        if (userDetail == null) {
            model.addAttribute("error", "Không tìm thấy thông tin người dùng.");
            return "Admin/error-page";
        }
        model.addAttribute("userDetail", userDetail);
        return "Admin/profile-admin";
    }

    @GetMapping("/admin-home/brand-manager")
    public String showBrandManagerPage(Model model) {
        List<Brand> brands = brandService.getAllBrands();
        model.addAttribute("brands", brands);
        return "Admin/brand-manager";
    }
}