package com.example.casem4.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private AppUser appUser;

    private LocalDateTime created_date;
    private Integer status;
    private Long totalPrice;

    // 1 Order có nhiều OrderDetail
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetail> orderDetails;

    public Order() {
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public AppUser getUser() {
        return appUser;
    }

    public void setUser(AppUser user) {
        this.appUser = user;
    }

    public LocalDateTime getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDateTime created_date) {
        this.created_date = created_date;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
