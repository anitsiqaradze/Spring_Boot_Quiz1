package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.dtos.OrderInfo;
import com.example.demo.entities.Order;
import com.example.demo.enums.OrderStatus;


public interface OrderRepository extends JpaRepository<Order, Long> {


@Query(value = """
    SELECT o.customer_name  AS customerName,
           o.order_status   AS orderStatus
    FROM orders o
    WHERE LOWER(o.customer_name) LIKE LOWER(CONCAT('%', :customerName, '%'))
    AND o.order_status = :#{#orderStatus.name()}
    ORDER BY o.created_at DESC
    """, nativeQuery = true)
List<OrderInfo> searchOrders(
    @Param("customerName") String customerName,
    @Param("orderStatus") OrderStatus orderStatus
);
}
