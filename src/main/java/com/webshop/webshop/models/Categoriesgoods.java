package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє сутність "Категорії Товарів".
 * Характеризує загальні категорії товарів.
 * Дата створення: 04.06.2023
 */
@Entity
public class Categoriesgoods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор категорії товару
    private String name; // Назва категорії товару

    /////////сутності що мають відношення One-to-Many з сутністю Goods
    @OneToMany(mappedBy = "categoriesgoods")
    // Зв'язок One-to-Many: Одна категорія товару може мати багато підкатегорій
    private List<Subcategoriesgoods> subcategoriesgoods = new ArrayList<>();

    public Categoriesgoods() {
    }

    public Categoriesgoods(String name) {
        this.name = name;
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

    public List<Subcategoriesgoods> getSubcategoriesgoods() {
        return subcategoriesgoods;
    }

    public void setSubcategoriesgoods(List<Subcategoriesgoods> subcategoriesgoods) {
        this.subcategoriesgoods = subcategoriesgoods;
    }
}
