package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.OrderInfo;
import com.example.demo.enums.OrderStatus;
import com.example.demo.repositories.OrderRepository;

@RestController("api/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }


//    @GetMapping("/search")
//     public List<OrderInfo> searchOrders(
//     @RequestParam String customerName,
//     @RequestParam OrderStatus status
// ) {
//     return orderRepository.searchOrders(customerName, status);
// }

    
   
}
