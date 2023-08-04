package com.example.springboot.Exercise4.models;

public class Meal {
    private String name;
    private String description;
    private double price;

    public Meal(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
}
