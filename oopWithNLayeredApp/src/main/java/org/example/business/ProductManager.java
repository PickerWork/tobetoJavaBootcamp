package org.example.business;

import org.example.dataAccess.*;
import org.example.core.logging.Logger;
import org.example.dataAccess.ProductDao;
import org.example.entities.Product;

import java.util.List;

//ProductServiceImpl olarakta adlandırılabilir.
public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;


    public ProductManager(ProductDao productDao,Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    //Kötü kod sonrasında clean kodlamayı yapacağız.
    public void add(Product product) throws Exception{ //response request
        //business rules
        if(product.getUnitPrice()<10) {
            throw new Exception("Ürün fiyatı 10 dan küçük olamaz!"); //throw=fırlatmak exception=istisna burada bir istisna hata fırlatıyoruz.
        }
        //Bir katman başka bir katmanın "data" kullanırken sadece iterface den erişim sağlamalı.
        //ProductDao productDao = new HibernateProductDao(); //Doğru bir kodlama tekniği değil.İşler karışabilir.
        productDao.add(product);

        for (Logger logger : loggers) { // [db,mail]
            logger.log(product.getName());
        }

    }
}