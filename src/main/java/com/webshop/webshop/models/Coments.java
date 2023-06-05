package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.time.LocalDate;

/**
 * Клас, що представляє сутність "Коментарі Товарів".
 * Містить Коментарі, що надають покупці щодо певного товару.
 * Дата створення: 04.06.2023
 */
@Entity
public class Coments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор коменту
    private LocalDate date_comment; // Дата створення коменту до товару
    @ManyToOne
    @JoinColumn(name = "userslists_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Коментів може належити одному Користувачу
    private Userslists userslists;
    @ManyToOne
    @JoinColumn(name = "goods_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Коментів може стосуватися одного Товару
    private Goods goods;
    private String comment; // Коментар до товару

    public Coments() {
    }

    public Coments(LocalDate date_comment, Userslists userslists, Goods goods, String comment) {
        this.date_comment = date_comment;
        this.userslists = userslists;
        this.goods = goods;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate_comment() {
        return date_comment;
    }

    public void setDate_comment(LocalDate date_comment) {
        this.date_comment = date_comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
