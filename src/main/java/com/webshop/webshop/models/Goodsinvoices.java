package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє сутність "Переліки Товарів що надходять до магазину".
 * Містить дані про Товари що надходять до магазину.
 * Дата створення: 04.06.2023
 */
@Entity
public class Goodsinvoices {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Переліку товару
    @ManyToOne
    @JoinColumn(name = "invoiceslists_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Переліків товару може стосуватися однієї Прибуткової накладної
    private Invoiceslists invoiceslists;
    @OneToOne
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Один Перелік товару належить одному Товару
    private Goods goods;
    private Float price; // Ціна товару
    private Integer quantity; // Кількість товару

    public Goodsinvoices() {
    }

    public Goodsinvoices(Invoiceslists invoiceslists, Goods goods, Float price, Integer quantity) {
        this.invoiceslists = invoiceslists;
        this.goods = goods;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Invoiceslists getInvoiceslists() {
        return invoiceslists;
    }

    public void setInvoiceslists(Invoiceslists invoiceslists) {
        this.invoiceslists = invoiceslists;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
