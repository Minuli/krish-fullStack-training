package com.minuli.rentcloud.profileservice.service;

import com.minuli.rentcloud.commons.model.Customer;
import com.minuli.rentcloud.profileservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
