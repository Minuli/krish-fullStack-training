package com.minuli.allocationservice.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_allocation")
public class Allocator {
    @Id
    private int allocation_id;
    private int order_id;
    private int allocated_quantity;

    public Allocator() {
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getAllocated_quantity() {
        return allocated_quantity;
    }

    public void setAllocated_quantity(int allocated_quantity) {
        this.allocated_quantity = allocated_quantity;
    }

    public void setAllocation_id(int allocation_id) {
        this.allocation_id = allocation_id;
    }


    public int getAllocation_id() {
        return allocation_id;
    }
}
