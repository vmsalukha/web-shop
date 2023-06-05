package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * Клас, що представляє сутність "Запитання щодо певних Товарів".
 * Містить дані про Запитання щодо певних Товарів від покупців.
 * Дата створення: 04.06.2023
 */
@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Запитання
    private LocalDate date_question; // Дата Запитання
    @ManyToOne
    @JoinColumn(name = "userslists_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Запитання(відповідей) може бути від одного Користувача
    private Userslists userslists;
    @ManyToOne
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Запитань(відповідей) може стосуватися одного Товару
    private Goods goods;
    private String question; // Запитання щодо певного Товару

    public Questions() {
    }

    public Questions(LocalDate date_question, Userslists userslists, Goods goods, String question) {
        this.date_question = date_question;
        this.userslists = userslists;
        this.goods = goods;
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate_question() {
        return date_question;
    }

    public void setDate_question(LocalDate date_question) {
        this.date_question = date_question;
    }

    public Userslists getUserslists() {
        return userslists;
    }

    public void setUserslists(Userslists userslists) {
        this.userslists = userslists;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
