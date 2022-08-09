package com.minuli.allocationservice.services;


import com.minuli.allocationservice.models.Allocator;
import com.minuli.allocationservice.models.Order;
import com.minuli.allocationservice.repositories.AllocationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllocationServiceImpl implements AllocationService{

    @Autowired
    AllocationRepository allocationRepository;


    @Override
    public Allocator save(Allocator allocator) {
        return null;
    }

    /* @Override
    public Allocator getAllOrders() {
        List<Order> orders = allocationRepository.findAll();

        return ;
    }*/
}
