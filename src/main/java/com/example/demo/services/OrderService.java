package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dtos.OrderInfo;
import com.example.demo.enums.OrderStatus;
import com.example.demo.repositories.OrderRepository;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }
    

    // public List<OrderInfo>searchOrder(String customerName, OrderStatus status){
    //     return this.orderRepository(customerName, status);
    // }


}