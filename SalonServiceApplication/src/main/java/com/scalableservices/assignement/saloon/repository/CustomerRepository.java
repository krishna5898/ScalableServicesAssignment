package com.scalableservices.assignement.saloon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scalableservices.assignement.saloon.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
