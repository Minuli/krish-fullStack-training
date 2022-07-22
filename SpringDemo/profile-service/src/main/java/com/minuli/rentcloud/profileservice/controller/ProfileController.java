package com.minuli.rentcloud.profileservice.controller;

import com.minuli.rentcloud.commons.model.Customer;
import com.minuli.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/service")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    public Customer save(@RequestBody Customer customer)
    {
        return customerService.save(customer);
    }

}
