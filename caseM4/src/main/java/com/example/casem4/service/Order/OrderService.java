package com.example.casem4.service.Order;

import com.example.casem4.model.Order;
import com.example.casem4.repository.IOrderRepository;
import com.example.casem4.service.Order.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    private IOrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
