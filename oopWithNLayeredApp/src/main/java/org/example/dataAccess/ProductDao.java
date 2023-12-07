package org.example.dataAccess;

import org.example.entities.Product;

public interface ProductDao{
    default void add(Product product) {

    }
}
