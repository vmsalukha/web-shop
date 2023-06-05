package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє сутність "Замовлення на Товари".
 * Містить Замовлення на Товари покупців.
 * Дата створення: 04.06.2023
 */
@Entity
public class Orderslists {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Замовлення на Товари
    private String number; //Номер Замовлення на Товари
    @ManyToOne
    @JoinColumn(name = "customers_id", referencedColumnName = "id")
    // Зв'язок Many-to-One: Багато Замовлень на Товари може стосуватися одного Продавця
    private Customers customers;
    @OneToOne
    @JoinColumn(name = "paymentstype_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Одне Замовлення на Товари відповідає одному Типу оплати за товар
    private Paymentstype paymentstype;
    @OneToOne
    @JoinColumn(name = "deliveriesmethod_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Одне Замовлення на Товари відповідає одному Методу доставлення товару
    private Deliveriesmethod deliveriesmethod;
    private String address_delivery;  // Адреса доставлення товару

    /////////сутності що мають відношення One-to-Many з сутністю Invoiceslists
    @OneToMany(mappedBy = "orderslists")
    // Зв'язок One-to-Many: Одне Замовлення на Товари може мати багато Переліків Товарів
    private List<Goodsorders> goodsorders = new ArrayList<>();

    public Orderslists() {
    }

    public Orderslists(String number, Customers customers, Paymentstype paymentstype, Deliveriesmethod deliveriesmethod, String address_delivery) {
        this.number = number;
        this.customers = customers;
        this.paymentstype = paymentstype;
        this.deliveriesmethod = deliveriesmethod;
        this.address_delivery = address_delivery;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public Paymentstype getPaymentstype() {
        return paymentstype;
    }

    public void setPaymentstype(Paymentstype paymentstype) {
        this.paymentstype = paymentstype;
    }

    public Deliveriesmethod getDeliveriesmethod() {
        return deliveriesmethod;
    }

    public void setDeliveriesmethod(Deliveriesmethod deliveriesmethod) {
        this.deliveriesmethod = deliveriesmethod;
    }

    public String getAddress_delivery() {
        return address_delivery;
    }

    public void setAddress_delivery(String address_delivery) {
        this.address_delivery = address_delivery;
    }

    public List<Goodsorders> getGoodsorders() {
        return goodsorders;
    }

    public void setGoodsorders(List<Goodsorders> goodsorders) {
        this.goodsorders = goodsorders;
    }
}
