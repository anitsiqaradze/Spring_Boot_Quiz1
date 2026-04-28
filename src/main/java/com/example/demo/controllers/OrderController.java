package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.OrderInfo;
import com.example.demo.enums.OrderStatus;
import com.example.demo.services.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

   @GetMapping("/search") // test url /search?customerName=David&orderStatus=PENDING
    public List<OrderInfo> searchOrders(@RequestParam String customerName, @RequestParam OrderStatus orderStatus) {

        return orderService.searchOrders(customerName, orderStatus);
    }

    
   
}
