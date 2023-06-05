package com.webshop.webshop.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Клас, що представляє сутність "Товари".
 * Містить дані та поведінку, пов'язані з товаром.
 * Дата створення: 04.06.2023
 */
@Entity
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; // Унікальний ідентифікатор Товару
    private String name; // Назва Товару
    private String short_discription; // Короткий опис Товару

    @OneToOne
    @JoinColumn(name = "discriptionsgoods_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Один Товар має один Повний Опис товару
    private Discriptionsgoods discriptionsgoods;

    @OneToOne
    @JoinColumn(name = "subcategoriesgoods_id", referencedColumnName = "id")
    // Зв'язок One-to-One: Один Товар належить одній Підкатегорії
    private Subcategoriesgoods subcategoriesgoods;


    /////////сутності що мають відношення One-to-Many з сутністю Goods
    @OneToMany(mappedBy = "goods")
    // Зв'язок One-to-Many: Один товар може мати багато Знижок
    private List<Discounts> discounts = new ArrayList<>();
    @OneToMany(mappedBy = "goods")
    // Зв'язок One-to-Many: Один товар може мати багато Фотографій
    private List<Photosgoods> photosgoods = new ArrayList<>();
    @OneToMany(mappedBy = "goods")
    // Зв'язок One-to-Many: Один товар може мати багато Властивостей, Атрибутів
    private List<Propertiesgoods> propertiesgoods = new ArrayList<>();
    @OneToMany(mappedBy = "goods")
    // Зв'язок One-to-Many: Один товар може мати багато Історій перегляду
    private List<Historyvievsgoods> historyvievsgoods = new ArrayList<>();
    @OneToMany(mappedBy = "goods")
    // Зв'язок One-to-Many: Щодо одного товару можна ставити багато Питань
    private List<Questions> questions = new ArrayList<>();
    @OneToMany(mappedBy = "goods")
    // Зв'язок One-to-Many: Один товар може мати багато Коментарів
    private List<Coments> coments = new ArrayList<>();

    public Goods() {
    }

    public Goods(String name, String short_discription, Discriptionsgoods discriptionsgoods, Subcategoriesgoods subcategoriesgoods) {
        this.name = name;
        this.short_discription = short_discription;
        this.discriptionsgoods = discriptionsgoods;
        this.subcategoriesgoods = subcategoriesgoods;
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

    public String getShort_discription() {
        return short_discription;
    }

    public void setShort_discription(String short_discription) {
        this.short_discription = short_discription;
    }

    public Discriptionsgoods getDiscriptionsgoods() {
        return discriptionsgoods;
    }

    public void setDiscriptionsgoods(Discriptionsgoods discriptionsgoods) {
        this.discriptionsgoods = discriptionsgoods;
    }

    public Subcategoriesgoods getSubcategoriesgoods() {
        return subcategoriesgoods;
    }

    public void setSubcategoriesgoods(Subcategoriesgoods subcategoriesgoods) {
        this.subcategoriesgoods = subcategoriesgoods;
    }

    public List<Discounts> getDiscounts() {
        return discounts;
    }

    public void setDiscounts(List<Discounts> discounts) {
        this.discounts = discounts;
    }

    public List<Photosgoods> getPhotosgoods() {
        return photosgoods;
    }

    public void setPhotosgoods(List<Photosgoods> photosgoods) {
        this.photosgoods = photosgoods;
    }

    public List<Propertiesgoods> getPropertiesgoods() {
        return propertiesgoods;
    }

    public void setPropertiesgoods(List<Propertiesgoods> propertiesgoods) {
        this.propertiesgoods = propertiesgoods;
    }

    public List<Historyvievsgoods> getHistoryvievsgoods() {
        return historyvievsgoods;
    }

    public void setHistoryvievsgoods(List<Historyvievsgoods> historyvievsgoods) {
        this.historyvievsgoods = historyvievsgoods;
    }

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }
}
