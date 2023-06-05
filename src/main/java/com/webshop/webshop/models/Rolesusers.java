package com.webshop.webshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Клас, що представляє сутність "Ролі Користувача".
 * Містить Ролі, що надаються Користувачам.
 * Дата створення: 04.06.2023
 */
@Entity
public class Rolesusers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Ролі Користувача
    private String name; // Назва Ролі Користувача
}
