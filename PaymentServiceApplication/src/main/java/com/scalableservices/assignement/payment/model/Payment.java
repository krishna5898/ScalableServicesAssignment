package com.scalableservices.assignement.payment.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Document(collection = "payments")
public class Payment {

    @Id
    private String id;

    @NotNull
    private String customerId;

    @NotNull
    private BigDecimal amount;
    
    @NotNull
    private String currency;
    
    @NotNull
    private String paymentMethod;

    @NotNull
    private String description;
}
