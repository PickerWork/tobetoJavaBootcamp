package org.example.models;

public class Product {
    public Product() {

    }
    private int id;
    private String brand;
    private double unitPrice;
    private int unitStock;

    public Product(int id, String brand, double unitPrice, int unitStock) {
        this.id = id;
        this.brand = brand;
        this.unitPrice = unitPrice;
        this.unitStock = unitStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
    public void print(){
        System.out.println("ID : " + this.getId()+ "\nMarka: " + this.getBrand() + "\nBirim Fiyatı: "
                + this.getUnitPrice() + "\nBirim Stoğu:  " + this.getUnitStock() + "\n---------------------------");
    }
}
