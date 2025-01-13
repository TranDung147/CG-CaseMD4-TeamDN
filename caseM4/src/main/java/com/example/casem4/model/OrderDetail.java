package com.example.casem4.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderDetailId;

    // 1 OrderDetail thuộc về 1 Order
    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderId") // Liên kết tới Order
    private Orderr order;

    // 1 OrderDetail thuộc về 1 Phone
    @ManyToOne
    @JoinColumn(name = "phoneId", referencedColumnName = "phoneId") // Liên kết tới Phone
    private Phone phoneId;

    private Integer quantity;
    private Long price;

    public OrderDetail() {
    }

    public Integer getId() {
        return orderDetailId;
    }

    public void setId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Orderr getOrder() {
        return order;
    }

    public void setOrder(Orderr order) {
        this.order = order;
    }

    public Phone getPhone() {
        return phoneId;
    }

    public void setPhone(Phone phone) {
        this.phoneId = phone;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
