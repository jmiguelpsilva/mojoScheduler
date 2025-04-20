package com.example.scheduler.service;

import com.example.scheduler.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

}
