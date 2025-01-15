package com.example.casem4.controller.admin;

import com.example.casem4.model.Orderr;
import com.example.casem4.service.Order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin-home")
public class OrderManagerController {

    private final OrderService orderService;

    @Autowired
    public OrderManagerController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("admin-home/orders-management")
    public String showOrderList(Model model) {
        List<Orderr> orders = orderService.getAllOrders();
        model.addAttribute("orders", orders);
        return "Admin/order-manager";
    }
}


