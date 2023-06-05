package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє сутність "Історія Переглядів Товарів".
 * Містить дані про Історія Переглядів Товарів покупцем.
 * Дата створення: 04.06.2023
 */
@Entity
public class Historyvievsgoods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Переглядів товару
    private LocalDateTime viewed_at; // Дата Перегляду товару
    @ManyToOne
    @JoinColumn(name = "customers_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Переглядів товару може стосуватися Покупця
    private Customers customers;
    @ManyToOne
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Переглядів товару може стосуватися Товару
    private Goods goods ;

    public Historyvievsgoods() {
    }

    public Historyvievsgoods(LocalDateTime viewed_at, Customers customers, Goods goods) {
        this.viewed_at = viewed_at;
        this.customers = customers;
        this.goods = goods;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getViewed_at() {
        return viewed_at;
    }

    public void setViewed_at(LocalDateTime viewed_at) {
        this.viewed_at = viewed_at;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
