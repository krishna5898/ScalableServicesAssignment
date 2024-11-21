package com.scalableservices.assignement.invoice.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String customerId;

    @NotNull
    private String haircutStyle;

    @NotNull
    private BigDecimal price;

    @NotNull
    private BigDecimal taxes;

    @NotNull
    private BigDecimal total;
}
