package com.webshop.webshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.attoparser.dom.Text;

/**
 * Клас, що представляє сутність "Повний Опис товару".
 * Містить дані про Повний Опис товару.
 * Дата створення: 04.06.2023
 */
@Entity
public class Discriptionsgoods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Опису товару
    private Text discription; // Повний Опис товару

    public Discriptionsgoods() {
    }

    public Discriptionsgoods(Text discription) {
        this.discription = discription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Text getDiscription() {
        return discription;
    }

    public void setDiscription(Text discription) {
        this.discription = discription;
    }
}
