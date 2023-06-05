package com.webshop.webshop.models;

import jakarta.persistence.*;

/**
 * Клас, що представляє сутність "Оцінка Товарів".
 * Містить дані Оцінку товарів, надану покупцями,які придбали даний товар.
 * Дата створення: 04.06.2023
 */
@Entity
public class Evaluationsgood {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Оцінки товарів
    @OneToOne
    @JoinColumn(name = "customers_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Один Покупець може поставити одну оцінку на один товар
    private Customers customers;
    @OneToOne
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Одна оцінка може належити одному товару
    private Goods goods;
    private Integer evaluation; // Оцінка Товару

    public Evaluationsgood() {
    }

    public Evaluationsgood(Customers customers, Goods goods, Integer evaluation) {
        this.customers = customers;
        this.goods = goods;
        this.evaluation = evaluation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(Integer evaluation) {
        this.evaluation = evaluation;
    }
}
