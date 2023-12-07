package com.springpair.pairWorkShopSecond;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {
    private List<Product> productList = new ArrayList<>();
    @GetMapping
    public List<Product> get(){
        return productList;
    }
    @PostMapping
    public String postProduct(@RequestBody List<Product> products){
        productList.addAll(products);
        return "Eklendi";
    }
    @PutMapping("/update/{id}")
    public Product putProduct(@PathVariable("id") int id,@RequestBody Product product){
        for (Product product1: productList) {
            if (product1.getId()==id){
                product1.setName(product.getName());
            }
        }
        return product;

    }
    @DeleteMapping
    public String deleteProduct(){
        return "Silindi.";
    }
}
