package org.example;

import org.example.models.Category;
import org.example.models.Order;
import org.example.models.Product;
import org.example.models.User;

public class Main {
    public static void main(String[] args) {
        User user = new User(1,"Yasin","Yıldız","pickerwork@gmail.com","05134312234");
        User user1 = new User(2,"Asaf","Yıldız","asaf@gmail.com","05434312234");
        User user2 = new User(3,"Samet","Yıldız","samet@gmail.com","05134312234");

        Category category = new Category(1,"Laptop");
        Category category1 = new Category(2,"Mouse");
        Category category2 = new Category(3,"Headset");

        Product product = new Product(1,"Asus",11500,15);
        Product product1 = new Product(2,"Steelseries",850,3);
        Product product2 = new Product(3,"Razer",1250,10);

        Order order = new Order(1,14,"15.12.2023","16.12.2023",11500);
        Order order1 = new Order(2,11,"14.12.2023","19.12.2023",850);
        Order order2 = new Order(3,9,"13.12.2023","21.12.2023",1250);

        user.print();
        user1.print();
        user2.print();

        category.print();
        category1.print();
        category2.print();

        product.print();
        product1.print();
        product2.print();

        order.print();
        order1.print();
        order2.print();
    }
}