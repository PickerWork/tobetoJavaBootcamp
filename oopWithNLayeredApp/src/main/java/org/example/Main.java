package org.example;

import org.example.business.ProductManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //DataAccess/Business/UI:User Interface
        //Parçala ve yönet / Sürdürülebilirlik /JDBC/Hibernate/JPA
        //Polymorphism
        Product product1 = new Product(1,"Iphone Xr",10000);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product1);

    }
}