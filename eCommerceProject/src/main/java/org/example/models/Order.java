package org.example.models;

public class Order {
    public Order() {

    }

    private int id;
    private int userId;
    private String orderDate;
    private String requiredDate;
    private double basketAmount;

    public Order(int id, int userId, String orderDate, String requiredDate, double basketAmount) {
        this.id = id;
        this.userId = userId;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.basketAmount = basketAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public void setRequiredDate(String requiredDate) {
        this.requiredDate = requiredDate;
    }

    public double getBasketAmount() {
        return basketAmount;
    }

    public void setBasketAmount(double basketAmount) {
        this.basketAmount = basketAmount;
    }

    public void print() {
        System.out.println("ID : " + this.getId() + "\nKullanıcı ID : " + this.getUserId() + "\nSipariş Tarihi: " + this.getOrderDate()
                + "\nTeslimat Tarih: " + this.getRequiredDate() + "\nSepet Tutarı: " + this.getBasketAmount() + "\n----------------------------------------");
    }
}
