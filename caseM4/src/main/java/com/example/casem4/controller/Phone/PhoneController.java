//package com.example.casem4.controller.Phone;
//
//import com.example.casem4.model.Phone;
//import com.example.casem4.service.Phone.PhoneService;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//
//@Controller
//public class PhoneController {
//    private final PhoneService phoneService;
//
//    public PhoneController(PhoneService phoneService) {
//        this.phoneService = phoneService;
//    }
//
//    @GetMapping("/phones")
//    public String showAllPhones(
//            @RequestParam(name = "page", required = false, defaultValue = "0") int page,
//            @RequestParam(name = "size", required = false, defaultValue = "6") int size,
//            Model model) {
//
//        Sort sort = Sort.by("name").ascending();
//        Pageable pageable = PageRequest.of(page, size, sort);
//        Page<Phone> phoneList = phoneService.findAll(pageable);
//        model.addAttribute("phoneList", phoneList);
//        return "redire