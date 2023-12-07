package org.example.dataAccess;

import org.example.entities.Product;

public class HibernateProductDao implements ProductDao{
    @Override
    public void add(Product product) {
        //Sadece db erişim kodları yazılır SQL
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
