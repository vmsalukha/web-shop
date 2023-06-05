package com.webshop.webshop.models;

import jakarta.persistence.*;

/**
 * Клас, що представляє сутність "Підкатегорії Товарів".
 * Характеризує Підкатегорії товарів, які належать до певних Категорій Товарів.
 * Дата створення: 04.06.2023
 */
@Entity
public class Subcategoriesgoods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Підкатегорії Товарів
    private String name; // Назва Підкатегорії Товарів
    @ManyToOne
    @JoinColumn(name = "categoriesgoods_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Підкатегорій Товарів може стосуватися однієї Категорії Товарів
    private Categoriesgoods categoriesgoods;

    public Subcategoriesgoods() {
    }

    public Subcategoriesgoods(String name, Categoriesgoods categoriesgoods) {
        this.name = name;
        this.categoriesgoods = categoriesgoods;
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

    public Categoriesgoods getCategoriesgoods() {
        return categoriesgoods;
    }

    public void setCategoriesgoods(Categoriesgoods categoriesgoods) {
        this.categoriesgoods = categoriesgoods;
    }
}
