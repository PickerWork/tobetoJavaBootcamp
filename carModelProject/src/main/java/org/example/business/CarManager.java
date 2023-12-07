package org.example.business;

import org.example.dataAccess.CarDao;
import org.example.entities.Car;

import java.util.logging.Logger;

public class CarManager {
    public CarDao carDao;
    private Logger[] loggers;

    public CarManager(CarDao carDao,Logger[] loggers) {
        this.carDao = carDao;
        this.loggers = loggers;

    }

    public void add(Car car) throws Exception {
        if(car.getUnitPrice()<100000){
            throw new Exception("Ürün fiyatı 100000 den küçük olamaz");
        }
        if(car.getStock()<4){
            throw new Exception("Stok sayısı 50'den az olamaz");
        }
        carDao.add(car);
        for(Logger logger : loggers){
            logger.log(car.getBrand());
        }
    }

}
