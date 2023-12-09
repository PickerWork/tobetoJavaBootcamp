package com.tobeto.springProject.controllers;

import com.tobeto.springProject.entities.Brand;
import com.tobeto.springProject.repositories.BrandRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
public class BrandsController {

    //Dependecy => Bağımlılık
    //Injection => Enjekte

    private final BrandRepository brandRepository;
    public BrandsController(BrandRepository brandRepository){
        this.brandRepository = brandRepository;
    }
    @GetMapping
    public List<Brand> getAll(){
        return brandRepository.findAll();
    }

    @GetMapping("{id}")
    public Brand getById(@PathVariable int id){
        //Optional<T> ilgili filtreden veri dönmeyebilir bunu opsiyonel kılar.
        return brandRepository.findById(id).orElseThrow();
    }
    @PostMapping
    public void add(@RequestBody Brand brand){
        brandRepository.save(brand);
    }

    @PutMapping
    public void update (@RequestBody Brand brand){}

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        //kod buraya geliyorsa exception fırlatmamıştır..
        //Brand brandToDelete = brandRepository.findById(id).orElseThrow();
        //buraya özel kontroller
        //brandRepository.delete(brandToDelete);
        //aşağıdaki kod yukarıdaki yapıyı kullanır
        brandRepository.deleteById(id);
    }
}
