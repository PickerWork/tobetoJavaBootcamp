package com.pairwork.pairWorkShopThird.controller;

import com.pairwork.pairWorkShopThird.modules.Category;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/category")
public class CategoryController {
    List<Category> inCategoryList = new ArrayList<>();

    @GetMapping
    public List<Category> getInCategoryList() {
        return inCategoryList;
    }

    @GetMapping("{id}")
    public Category getById(@PathVariable int id) {

        Category category = inCategoryList
                .stream()
                .filter((p) -> p.getId() == id)
                .findFirst()
                .orElseThrow();
        return category;
    }


    @PutMapping
    public String setCategoryName(@RequestBody Category category) {
        inCategoryList.add(category);

        return "Kategori Eklendi: " +
                "ID: " + category.getId() +
                ", Kategorti İsmi: " + category.getName();
    }

    @PutMapping("{id}")
    public String update(@PathVariable int id, @RequestBody Category category) {
        Category categories = inCategoryList
                .stream()
                .filter((p) -> p.getId() == id)
                .findFirst()
                .orElseThrow();
        categories.setName(category.getName());

        return "Kategori Değiştirildi: " +
                "ID: " + id +
                ",Kategorti İsmi: " + categories.getName();
        /*for (Category categories : inCategoryList) {
            if (categories.getId() == id) {
                categories.setName(category.getName());

                return "Kategori Değiştirildi: " +
                        "ID: " + id +
                        ",Kategorti İsmi: " + categories.getName();


            } else {
                return "Kategori bulunamadı";
            }
        }
        return null;*/
    }

    @DeleteMapping("{id}")
    public String delete(@PathVariable int id) {
        Category categories = inCategoryList
                .stream()
                .filter((p) -> p.getId() == id)
                .findFirst()
                .orElseThrow();
        inCategoryList.remove(categories);
        return categories.getName() + " Silindi";
    }

       /* for (Category categories : inCategoryList) {
            if (categories.getId() == id) {
                inCategoryList.remove(categories);
                return categories.getName() + " Silindi";
            } else {
                return "Kategori bulunamadı";
            }
        }
        return null;
    }*/
}
