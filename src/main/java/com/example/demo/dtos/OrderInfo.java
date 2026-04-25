package com.example.demo.dtos;

import com.example.demo.enums.OrderStatus;

import lombok.Data;

@Data
public class OrderInfo {
    private String bookTitle;
    private String customerName;
    private OrderStatus status;
  
}
