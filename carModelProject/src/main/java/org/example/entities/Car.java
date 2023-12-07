package org.example.entities;

import java.util.logging.LogRecord;

public class Car {
    private int id;
    private String model;
    private String brand;
    private String color;
    private double unitPrice;
    private int stock;

    public Car() {
    }

    public Car(int id, String brand, String model, String color, double unitPrice, int stock) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.unitPrice = unitPrice;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LogRecord getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
