package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє сутність "Покупці".
 * Містить дані та поведінку, пов'язані з Покупцем.
 * Дата створення: 04.06.2023
 */
@Entity
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Покупця
    private String name; // Ім'я(повне) зареєстрованого Покупця
    private String address; // Адреса проживання зареєстрованого Покупця
    private String phone; // Телефон зареєстрованого Покупця
    private String email; // Електронна скринька зареєстрованого Покупця
    @OneToOne
    @JoinColumn(name = "userslists_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Один Покупець відповідає одному Користувачу
    private Userslists userslists;

    /////////сутності що мають відношення Many-to-One з сутністю Customers
    @OneToMany(mappedBy = "customers")
    // Зв'язок One-to-Many: Один Покупець може мати багато Переглядів різних товарів
    private List<Historyvievsgoods> historyvievsgoods = new ArrayList<>();
    @OneToMany(mappedBy = "customers")
    // Зв'язок One-to-Many: Один Покупець може мати багато Замовлень товарів
    private List<Orderslists> orderslists = new ArrayList<>();

    public Customers() {
    }

    public Customers(String name, String address, String phone, String email, Userslists userslists) {
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

    public List<Historyvievsgoods> getHistoryvievsgoods() {
        return historyvievsgoods;
    }

    public void setHistoryvievsgoods(List<Historyvievsgoods> historyvievsgoods) {
        this.historyvievsgoods = historyvievsgoods;
    }

    public List<Orderslists> getOrderslists() {
        return orderslists;
    }

    public void setOrderslists(List<Orderslists> orderslists) {
        this.orderslists = orderslists;
    }
}
