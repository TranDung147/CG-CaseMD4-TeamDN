package com.example.casem4.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 1 OrderDetail thuộc về 1 Order
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "order_id") // Liên kết tới Order
    private Order order;

    // 1 OrderDetail thuộc về 1 Phone
    @ManyToOne
    @JoinColumn(name = "phone_id", referencedColumnName = "phone_id") // Liên kết tới Phone
    private Phone phone;

    private Integer quantity;
    private Long price;

    public OrderDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
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
