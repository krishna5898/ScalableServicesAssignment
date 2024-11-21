package com.scalableservices.assignement.payment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.scalableservices.assignement.payment.model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
