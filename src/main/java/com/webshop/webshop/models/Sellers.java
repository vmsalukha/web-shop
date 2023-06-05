package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє сутність "Продавці Товарів".
 * Містить дані та поведінку, пов'язані з Продавцями Товарів.
 * Дата створення: 04.06.2023
 */
@Entity
public class Sellers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Продавця Товарів
    private String name; // Ім'я(повне) Продавця Товарів
    private String address; // Адреса Продавця Товарів
    private String phone; // Телефон Продавця Товарів
    private String email; // Електронна скринька Продавця Товарів
    @OneToOne
    @JoinColumn(name = "userslists_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Один Продавець Товарів відповідає одному Користувачу
    private Userslists userslists;

    /////////сутності що мають відношення One-to-Many з сутністю Goods
    @OneToMany(mappedBy = "sellers")
    // Зв'язок One-to-Many: Один Продавець Товарів може мати багато Прибуткових накладних Товарів до магазину
    private List<Invoiceslists> invoiceslists = new ArrayList<>();

    public Sellers() {
    }

    public Sellers(String name, String address, String phone, String email, Userslists userslists) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.userslists = userslists;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Userslists getUserslists() {
        return userslists;
    }

    public void setUserslists(Userslists userslists) {
        this.userslists = userslists;
    }

    public List<Invoiceslists> getInvoiceslists() {
        return invoiceslists;
    }

    public void setInvoiceslists(List<Invoiceslists> invoiceslists) {
        this.invoiceslists = invoiceslists;
    }
}
