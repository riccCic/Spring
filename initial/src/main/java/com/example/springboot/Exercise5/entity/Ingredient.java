package com.example.springboot.Exercise5.entity;

import jakarta.persistence.*;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean isVegetarian;
    private boolean isVegan;
    private boolean isGlutenFree;
    private boolean isLactoseFree;

    public Ingredient() {
    }

    public Ingredient(String name, boolean isVegetarian, boolean isVegan, boolean isGlutenFree, boolean isLactoseFree) {
        this.name = name;
        this.isVegetarian = isVegetarian;
        this.isVegan = isVegan;
        this.isGlutenFree = isGlutenFree;
        this.isLactoseFree = isLactoseFree;
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

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        isVegetarian = vegetarian;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public boolean isLactoseFree() {
        return isLactoseFree;
    }

    public void setLactoseFree(boolean lactoseFree) {
        isLactoseFree = lactoseFree;
    }
}
