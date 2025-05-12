package com.mine.order_service;

import org.springframework.stereotype.Component;

@Component
public class UserFallback implements UserClient {

    @Override
    public String getUsers() {
        return "User service şu anda kullanılamıyor (fallback aktif).";
    }
}