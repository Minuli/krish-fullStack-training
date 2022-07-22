package com.minuli.rentcloud.profileservice.repository;

import com.minuli.rentcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {


}
