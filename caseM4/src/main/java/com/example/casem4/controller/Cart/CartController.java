//package com.example.casem4.controller.Cart;
//
//import com.example.casem4.model.DTO.CartDTO;
//import com.example.casem4.model.Phone;
//import com.example.casem4.service.Cart.imple.ICartService;
//import com.example.casem4.service.Phone.imple.IPhoneService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@Controller
//@RequestMapping("/Cart")
//public class CartController {
//    @Autowired
//    private ICartService cartService;
//    @Autowired
//    private IPhoneService phoneService;
//
//    @ModelAttribute("cart")
//    public CartDTO initCart() {
//        return new CartDTO();
//    }
////    @PostMapping("/add")
////    public String addPhoneToCart(
////            @RequestParam("phoneID") int phoneID,
////            @RequestParam("quantity") int quantity,
////            @SessionAttribute("cart") CartDTO cartDTO
////    ) {
////        Optional<Phone> phone =
////    }
//}
