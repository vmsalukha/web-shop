package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, що представляє сутність "Користувачі".
 * Містить дані та поведінку, пов'язані з Користувачами магазину.
 * Дата створення: 04.06.2023
 */
@Entity
public class Userslists {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Користувача
    @OneToOne
    @JoinColumn(name = "rolesusers_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Один Користувач має одну Роль
    private Rolesusers rolesusers;

    private String nickname; // Унікальний ідентифікатор Користувача
    private String password;// пароль Користувача (String??? чи інший тип)

    /////////сутності що мають відношення One-to-Many з сутністю Invoiceslists
    @OneToMany(mappedBy = "userslists")
    // Зв'язок One-to-Many: Один Користувач може мати багато Питань(відповідей) щодо певного Товару
    private List<Questions> questions = new ArrayList<>();
    @OneToMany(mappedBy = "userslists")
    // Зв'язок One-to-Many: Один Користувач може мати багато Коментарів щодо певного Товару
    private List<Coments> coments = new ArrayList<>();
    public Userslists() {
    }

    public Userslists(Rolesusers rolesusers, String nickname, String password) {
        this.rolesusers = rolesusers;
        this.nickname = nickname;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Rolesusers getRolesusers() {
        return rolesusers;
    }

    public void setRolesusers(Rolesusers rolesusers) {
        this.rolesusers = rolesusers;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    public List<Coments> getComents() {
        return coments;
    }

    public void setComents(List<Coments> coments) {
        this.coments = coments;
    }
}
