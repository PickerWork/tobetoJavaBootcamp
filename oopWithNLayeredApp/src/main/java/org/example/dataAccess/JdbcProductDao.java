package org.example.dataAccess;

import org.example.entities.Product;

//Dao : Data Access Object
public class JdbcProductDao implements ProductDao{
    @Override
    public void add(Product product){
        //Sadece db erişim kodları yazılır SQL
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}
//Hibernate