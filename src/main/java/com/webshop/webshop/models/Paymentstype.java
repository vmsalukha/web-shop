package com.webshop.webshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Клас, що представляє сутність "Тип оплати за Товар".
 * Містить дані про Типи оплати за Товар.
 * Дата створення: 04.06.2023
 */
@Entity
public class Paymentstype {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Типу оплати
    private String payment_type; // Тип оплати

    public Paymentstype() {
    }

    public Paymentstype(String payment_type) {
        this.payment_type = payment_type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }
}
