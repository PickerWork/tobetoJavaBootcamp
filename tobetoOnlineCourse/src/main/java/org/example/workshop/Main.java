package org.example.workshop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        DbManager dbManager = new PostgreSqlManager();
        dbManager.add(1);
        dbManager.update(2);
    }
}
