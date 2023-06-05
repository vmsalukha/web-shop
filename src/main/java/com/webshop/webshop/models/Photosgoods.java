package com.webshop.webshop.models;

import jakarta.persistence.*;

/**
 * Клас, що представляє сутність "Фотографії Товарів".
 * Містить дані та поведінку, пов'язані з товаром.
 * Дата створення: 04.06.2023
 */
@Entity
public class Photosgoods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Фотографії товару
    private String description; // Опис Фотографії товару
    private String path; // Шлях до файлу Фотографії товару
    @ManyToOne
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Фотографій може стосуватися одного Товару
    private Goods goods;

    public Photosgoods() {
    }

    public Photosgoods(String description, String path, Goods goods) {
        this.description = description;
        this.path = path;
        this.goods = goods;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
