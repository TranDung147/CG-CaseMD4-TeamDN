package com.example.casem4.controller.Cart;
import com.example.casem4.model.AppUser;
import com.example.casem4.model.Cart;
import com.example.casem4.model.CartItem;
import com.example.casem4.service.Cart.CartService;
import com.example.casem4.service.Cart.imple.ICartItemService;
import com.example.casem4.service.Cart.imple.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CartController {
    @Autowired
    private ICartService cartService;
    @Autowired
    private ICartItemService cartItemService;

    @GetMapping("cart")
    public String getCart(@RequestParam(name = "cart_id", required = false) Integer cart_id, Model model) {
        List<Cart> carts;
        if (cart_id != null) {
            carts = cartService.getCartById(cart_id);
        } else {
            carts = List.of();
        }
        model.addAttribute("cart", carts);

        return "Cart/cart";
    }

    @PostMapping("cart")
    public String addPhoneToCart(
            @RequestParam("phone_id") Integer phone_id,
            @RequestParam(name = "cart_id", required = false) Integer cart_id,
            @RequestParam(name = "quantity", required = false, defaultValue = "1") Integer quantity,
            Model model) {
        if (phone_id == null || quantity <= 0) {
            // Trả về lỗi hoặc thông báo nếu phone_id hoặc quantity không hợp lệ
            model.addAttribute("error", "Thông tin sản phẩm hoặc số lượng không hợp lệ!");
            return "redirect:/error";
        }

        if (cart_id != null) {
            // Nếu đã có cart_id, thêm sản phẩm vào giỏ hàng
            cartItemService.addPhoneToCart(phone_id, cart_id, quantity);
        } else {
            // Nếu không có cart_id, xử lý logic tạo giỏ hàng mới
            Cart newCart = cartService.createNewCart(new AppUser()); // Giả sử bạn có phương thức này trong cartService
            cartItemService.addPhoneToCart(phone_id, newCart.getCartID(), quantity);
        }

        // Điều hướng về trang giỏ hàng
        return "redirect:/cartItem";
    }
    @GetMapping("cartItem")
    public String getCartItems(@RequestParam(name = "phone_id") Integer phoneId,
                               @RequestParam(name = "cart_id", required = false) Integer cartId,
                               Model model) {
        List<CartItem> cartItem = cartItemService.getCartItems(cartId, phoneId);
        model.addAttribute("cartItems", cartItem);
        return "Cart/cart";
    }
}