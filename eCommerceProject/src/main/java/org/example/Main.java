package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Yasin","Yıldız","pickerwork@gmail.com","05134312234");
        Category category = new Category(1,"Laptop");
        Product product = new Product(1,"Asus",11500,15);
        Order order = new Order(1,14,"15.12.2023","16.12.2023",11500);

        user.print();
        category.print();
        product.print();
        order.print();
    }
}