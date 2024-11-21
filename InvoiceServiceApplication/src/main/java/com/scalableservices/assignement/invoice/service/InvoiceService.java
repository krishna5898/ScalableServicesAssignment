package com.scalableservices.assignement.invoice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.scalableservices.assignement.invoice.model.Invoice;
import com.scalableservices.assignement.invoice.repository.InvoiceRepository;

@Service
public class InvoiceService {

	@Autowired
	private InvoiceRepository invoiceRepository;

	public Invoice createInvoice(Invoice invoice) {
		return invoiceRepository.save(invoice);
	}

	public List<Invoice> getAllInvoices() {
		return invoiceRepository.findAll();
	}

	public Invoice getInvoiceById(Long id) {
		return invoiceRepository.findById(id).orElse(null);
	}

	public void deleteInvoice(Long id) {
		invoiceRepository.deleteById(id);
	}

	@KafkaListener(topics = "payment-events", groupId = "group_id")
	public void listenPaymentEvent(String event) throws InterruptedException {
		System.out.println("Appointment Confirmed..");
		Thread.sleep(5000);
		System.out.println(event);
		Thread.sleep(5000);
		System.out.println("Invoice Generated..!!");
	}
}
