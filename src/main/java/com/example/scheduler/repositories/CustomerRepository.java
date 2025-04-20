package com.example.scheduler.repositories;

import com.example.scheduler.domain.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public abstract class CustomerRepository extends JpaRepository<Customer, Long> {

}