package com.scalableservices.assignement.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.scalableservices.assignement.payment.model.Payment;
import com.scalableservices.assignement.payment.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public Payment createPayment(Payment payment) {
		return paymentRepository.save(payment);
	}

	public List<Payment> getAllPayments() {
		return paymentRepository.findAll();
	}

	public Payment getPaymentById(String id) {
		return paymentRepository.findById(id).orElse(null);
	}

	public void deletePayment(String id) {
		paymentRepository.deleteById(id);
	}

	@KafkaListener(topics = "saloon-events", groupId = "group_id")
	public void listenSaloonEvent(String event) {
		System.out.println("Received event: " + event);
		kafkaTemplate.send("payment-events", "Payment Received");
	}
}
