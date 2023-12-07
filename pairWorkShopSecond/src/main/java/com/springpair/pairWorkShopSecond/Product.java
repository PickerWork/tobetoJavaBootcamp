package com.springpair.pairWorkShopSecond;

public class Product {
    private int id;
    private String name;
    private double unitPrice;
    private int unitStock;

    public Product() {

    }

    public Product(int id, String name, double unitPrice, int unitStock) {
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
        this.unitStock = unitStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitStock() {
        return unitStock;
    }

    public void setUnitStock(int unitStock) {
        this.unitStock = unitStock;
    }
}
