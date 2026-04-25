package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.dtos.OrderInfo;
import com.example.demo.entities.Order;
import com.example.demo.enums.OrderStatus;


public interface OrderRepository extends JpaRepository<Order, Long> {



    // @Query("SELECT o FROM Order o WHERE LOWER(o.customerName) LIKE LOWER(CONCAT('%', :customerName, '%')) AND o.status = :status ORDER BY o.createdAt DESC")
    // public List<OrderInfo> searchOrders(String customerName, OrderStatus status);
    
// List<Order> findByCustomerNameContainingIgnoreCaseAndStatusOrderByCreatedAtDesc(
//     String customerName,
//     OrderStatus status
// );
}
