package com.example.casem4.controller.admin;

import com.example.casem4.model.Brand;
import com.example.casem4.model.Phone;
import com.example.casem4.model.UserDetail;
import com.example.casem4.service.AppUser.AppUserService;
import com.example.casem4.service.Brand.BrandService;
import com.example.casem4.service.Phone.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AdminController {

    private final PhoneService phoneService;
    private final AppUserService userDetailService;
    private final BrandService brandService;

    @Autowired
    public AdminController(PhoneService phoneService, AppUserService userDetailService, BrandService brandService) {
        this.phoneService = phoneService;
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

    @GetMapping("/admin-home/phone-manager")
    public String showPhoneManagerPage(Model model, Pageable pageable,@RequestParam(required = false) String search) {
        Page<Phone> phones = phoneService.findAll(pageable);
        if (search != null && !search.isEmpty()) {
            phones = phoneService.searchPhones(search, pageable);
        } else {
            phones = phoneService.findAll(pageable);
        }
        model.addAttribute("phones", phones);

        return "Admin/phone-manager";
    }

    @GetMapping("/admin-home/phone-manager/edit/{phone_id}")
    public String showEditPhonePage(@PathVariable("phone_id") Integer phoneId, Model model) {
        Phone phone = phoneService.getPhoneById(phoneId);
        if (phone == null) {
            model.addAttribute("error", "Điện thoại không tồn tại.");
            return "Admin/error-page";
        }
        model.addAttribute("phone", phone);
        return "Admin/edit-phone";
    }

    @PostMapping("/admin-home/phone-manager/update")
    public String updatePhone(@ModelAttribute Phone phone) {
        phoneService.updatePhone(phone);
        return "redirect:/admin-home/phone-manager";
    }

    @PostMapping("/admin-home/phone-manager/delete/{phone_id}")
    public String deletePhone(@PathVariable("phone_id") Integer phoneId) {
        phoneService.deletePhone(phoneId);
        return "redirect:/admin-home/phone-manager";
    }
}

