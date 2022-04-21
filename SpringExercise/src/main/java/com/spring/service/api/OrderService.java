package com.spring.service.api;

import com.spring.domain.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    public List<Order> findAll();
    public Optional<Order> getOrderById(long id);
    public Order createOrder(Order order);
}
