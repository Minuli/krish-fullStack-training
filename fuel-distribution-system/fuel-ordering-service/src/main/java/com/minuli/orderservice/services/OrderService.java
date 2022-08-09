package com.minuli.orderservice.services;

import com.minuli.orderservice.models.Order;

import java.util.List;

public interface OrderService {

    Order save(Order order);
    List<Order> getAllOrders();
}
