package com.example.interceptor.springinterceptors.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public String order(){
        return "Your order placed successfully";
    }

    @GetMapping("/orders/total")
    public int getTotalOrders(){
        return 100;
    }
}
