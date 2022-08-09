package com.minuli.allocationservice.controllers;

import com.minuli.allocationservice.services.AllocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AllocationController {

    @Autowired
    AllocationService allocationService;



}
