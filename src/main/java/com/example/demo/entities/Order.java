package com.example.demo.entities;

import java.time.LocalDateTime;

import com.example.demo.enums.OrderStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "order_status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;






    // @ManyToOne(fetch = FetchType.LAZY)
    // @JoinColumn(name = "book_id")
    // private Book book;
    // @Column(name="customer_name")
    // private String customerName;
   
    
}
