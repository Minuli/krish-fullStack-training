package com.minuli.allocationservice.repositories;

import com.minuli.allocationservice.Allocator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllocationRepository extends JpaRepository<Allocator,Integer> {
}
