package com.minuli.allocationservice.services;



import com.minuli.allocationservice.models.Allocator;

import java.util.List;

public interface AllocationService {
    Allocator save(Allocator allocator);
    Allocator getAllOrders();
}
