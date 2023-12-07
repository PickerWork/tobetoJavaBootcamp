package org.example;

import org.example.business.CarManager;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;
import org.example.logging.DatabaseLogger;
import org.example.logging.FileLogger;
import org.example.logging.Logger;
import org.example.logging.MailLogger;

public class Main {
    public static void main(String[] args) throws Exception{
        Car car = new Car(1,"Tesla","S","White",400000,5);
        Car car1 = new Car(2,"BMW","i8","Black",450000,8);
        Car car2 = new Car(3,"Mercedes","AMG","Red",300000,4);
        Car car3 = new Car(4,"Renault","Captur","Blue",100000,2);
        Car car4 = new Car(5,"Citroen","i20","Green",200000,10);

        Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};
        CarManager carManager= new CarManager(new JdbcCarDao(),loggers);
        carManager.add(car);
        System.out.println("----------------------------");
        carManager.add(car1);
        System.out.println("----------------------------");
        carManager.add(car2);
        System.out.println("----------------------------");
        carManager.add(car3);
        System.out.println("----------------------------");
        carManager.add(car4);


    }
}