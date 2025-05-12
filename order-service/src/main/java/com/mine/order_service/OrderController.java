package com.mine.order_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private final UserClient userClient;

    public OrderController(UserClient userClient) {
        this.userClient = userClient; 
    }

    @GetMapping("/orders")
    public String getOrderDetails() {
        try {
            return "Sipariş verisi → " + userClient.getUsers();
        } catch (Exception e) {
            return "Sipariş verisi → User service şu anda kullanılamıyor (fallback aktif).";
        }
    }
}