package com.minuli.orderservice.controllers;

import com.minuli.orderservice.models.Order;
import com.minuli.orderservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/order",method = RequestMethod.POST)
    public Order save(@RequestBody Order order)
    {
        return orderService.save(order);
    }

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    public List<Order> getAllOrders()
    {
        return orderService.getAllOrders();
    }
}
