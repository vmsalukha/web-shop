package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє сутність "Знижки Товарів".
 * Містить дані щодо Знижок на певний товар.
 * Дата створення: 04.06.2023
 */
@Entity
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Знижки на товар
    @ManyToOne
    // Зв'язок Many-to-One: Багато Знижок може стосуватися одного Товару
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    private Goods goods;
    private String name; // Назва Знижки на товар
    private String discription; // Опис Знижки на товар
    private LocalDate date_start; // Дата, з якої стартує Знижка на товар
    private LocalDate date_end; // Кінцева дата Знижка на товар
    private Integer value; // Значення Знижки у відсотках

    public Discounts() {
    }

    public Discounts(Goods goods, String name, String discription, LocalDate date_start, LocalDate date_end, Integer value) {
        this.goods = goods;
        this.name = name;
        this.discription = discription;
        this.date_start = date_start;
        this.date_end = date_end;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public LocalDate getDate_start() {
        return date_start;
    }

    public void setDate_start(LocalDate date_start) {
        this.date_start = date_start;
    }

    public LocalDate getDate_end() {
        return date_end;
    }

    public void setDate_end(LocalDate date_end) {
        this.date_end = date_end;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
