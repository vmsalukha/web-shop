package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє сутність "Прибуткові накладні Товарів до магазину".
 * Містить Накладні з товарами які надходять до магазину.
 * Дата створення: 04.06.2023
 */
@Entity
public class Invoiceslists {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Накладної
    private LocalDate date;  // Дата Накладної
    private String number;  // Номер Накладної
    @ManyToOne
    @JoinColumn(name = "sellers_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Накладних може стосуватися одного Продавця
    private Sellers sellers;

    /////////сутності що мають відношення One-to-Many з сутністю Invoiceslists
    @OneToMany(mappedBy = "invoiceslists")
    // Зв'язок One-to-Many: Одна Накладн може мати багато Переліків Товарів що надходять до магазину
    private List<Goodsinvoices> goodsinvoices = new ArrayList<>();

    public Invoiceslists() {
    }

    public Invoiceslists(LocalDate date, String number, Sellers sellers) {
        this.date = date;
        this.number = number;
        this.sellers = sellers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Sellers getSellers() {
        return sellers;
    }

    public void setSellers(Sellers sellers) {
        this.sellers = sellers;
    }

    public List<Goodsinvoices> getGoodsinvoices() {
        return goodsinvoices;
    }

    public void setGoodsinvoices(List<Goodsinvoices> goodsinvoices) {
        this.goodsinvoices = goodsinvoices;
    }
}
