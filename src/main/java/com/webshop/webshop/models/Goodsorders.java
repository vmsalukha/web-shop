package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє сутність "Перелік Товарів в замовленні Покупця".
 * Містить дані про Товари які замовляє Покупець.
 * Дата створення: 04.06.2023
 */
@Entity
public class Goodsorders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Переліку товару в замовлені
    @ManyToOne
    @JoinColumn(name = "orderslists_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Переліків товару може стосуватися одного Замовлення покупця
    private Orderslists orderslists;
    @OneToOne
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Один Перелік товару в Замовлені належить одному Товару
    private Goods goods;
    private Float price;
    private Integer quantity;

    public Goodsorders() {
    }

    public Goodsorders(Orderslists orderslists, Goods goods, Float price, Integer quantity) {
        this.orderslists = orderslists;
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

    public Orderslists getOrderslists() {
        return orderslists;
    }

    public void setOrderslists(Orderslists orderslists) {
        this.orderslists = orderslists;
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
