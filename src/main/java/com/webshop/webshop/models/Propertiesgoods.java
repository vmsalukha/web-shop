package com.webshop.webshop.models;

import jakarta.persistence.*;

/**
 * Клас, що представляє сутність "Властивості, Атрибути Товарів".
 * Містить дані та Властивості та Атрибути товару, які описують характеристику товару.
 * Дата створення: 04.06.2023
 */
@Entity
public class Propertiesgoods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Властивостей, Атрибутів
    private String name; // Назва Властивості, Атрибуту
    private String type; // Тип значення Властивості, Атрибуту
    private String value; // Значення Властивості, Атрибуту
    @ManyToOne
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Властивостей, Атрибутів може стосуватися одного Товару
    private Goods goods;

    public Propertiesgoods() {
    }

    public Propertiesgoods(String name, String type, String value, Goods goods) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.goods = goods;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
