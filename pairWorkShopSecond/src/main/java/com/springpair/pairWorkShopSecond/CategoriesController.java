package com.springpair.pairWorkShopSecond;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/categories")
public class CategoriesController {
    @GetMapping
    public String getCategories(){
        return "Kategoriler listelendi.";
    }
    @GetMapping("id")
    public String getCategoriesId (){
        return "Kategoriler id ye göre getirildi";
    }
    @PostMapping
    public String postCategories(){
        return "Kategoriler eklendi";

    }
    @PutMapping
    public String putCategories(){
        return "Kategoriler güncellendi.";
    }
    @DeleteMapping
    public String deletCategories(){
        return "Kategoriler silindi.";
    }
}
