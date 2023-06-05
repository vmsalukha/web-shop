package com.webshop.webshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Клас, що представляє сутність "Метод доставки Товарів".
 * Містить Методи доставки товарів покупцеві.
 * Дата створення: 04.06.2023
 */
@Entity
public class Deliveriesmethod {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Методу
    private String method; // Метод доставки Товарів

    public Deliveriesmethod() {
    }

    public Deliveriesmethod(String method) {
        this.method = method;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
