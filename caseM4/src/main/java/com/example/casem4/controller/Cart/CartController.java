package com.example.casem4.controller.Cart;
import com.example.casem4.model.AppUser;
import com.example.casem4.model.Cart;
import com.example.casem4.model.CartItem;
import com.example.casem4.model.Phone;
import com.example.casem4.service.Cart.CartService;
import com.example.casem4.service.Cart.imple.ICartItemService;
import com.example.casem4.service.Cart.imple.ICartService;
import com.example.casem4.service.Phone.imple.IPhoneService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class CartController {
    @Autowired
    private ICartService cartService;
    @Autowired
    private ICartItemService cartItemService;
    @Autowired
    private IPhoneService phoneService;


    @GetMapping("cartItem")
    public String getCartItems(@RequestParam(name = "cart_id", required = false) Integer cartId, Model model, HttpSession session) {
        if (cartId == null) {
            cartId = (Integer) session.getAttribute("cartId");
            if (cartId == null) {
                model.addAttribute("error", "Giỏ hàng của bạn đang trống!");
                return "Cart/cart";
            }
        }

        try {
            List<CartItem> cartItems = cartItemService.getCartItemByCartId(cartId);
            model.addAttribute("cartItems", cartItems);
        } catch (Exception e) {
            model.addAttribute("error", "Không thể lấy dữ liệu giỏ hàng: " + e.getMessage());
        }

        return "Cart/cart";
    }

    @PostMapping("cart")
    public String addPhoneToCart(
            @RequestParam("phone_id") Integer phoneId,
            @RequestParam(name = "quantity", required = false, defaultValue = "1") Integer quantity,
            HttpSession session,
            Model model) {
        Integer cartId = (Integer) session.getAttribute("cartId");
        Phone phone = phoneService.findById(phoneId);
        Double totalPrice = phone.getPrice() * quantity;
        if (phoneId == null || quantity <= 0) {
            // Trả về lỗi hoặc thông báo nếu phone_id hoặc quantity không hợp lệ
            model.addAttribute("error", "Thông tin sản phẩm hoặc số lượng không hợp lệ!");
            return "redirect:/error";
        }

        try {
            if (cartId != null) {
                cartItemService.addPhoneToCart(cartId, phoneId, quantity, phone.getPrice(), totalPrice);
            } else {
                Cart newCart = cartService.createNewCart(new AppUser());
                cartItemService.addPhoneToCart(newCart.getCartID(), phoneId, quantity, phone.getPrice(), totalPrice);
            }
        } catch (Exception e) {
            model.addAttribute("error", "Không thể thêm sản phẩm vào giỏ hàng: " + e.getMessage());
            return "redirect:/error";
        }

        return "redirect:/cartItem";
    }

    @PostMapping("cartItem/remove")
    public String removeCartItem(@RequestParam("cartItemId") Integer cartItemId, Model model) {
        try {
            cartItemService.removeCartItem(cartItemId);
        } catch (Exception e) {
            model.addAttribute("error", "Không thể xóa mục trong giỏ hàng: " + e.getMessage());
        }

        // Không cần trả về toàn bộ trang, chỉ cập nhật dữ liệu nếu cần
        return "redirect:/cartItem";
    }

}