package com.tobeto.springProject.controllers;

import com.tobeto.springProject.services.dtos.request.brand.AddBrandRequest;
import com.tobeto.springProject.services.dtos.responses.brand.GetBrandResponse;
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

    @GetMapping("{id}") //kullanıcıya cevap giden kısım
    public GetBrandResponse getById(@PathVariable int id){
        //Optional<T> ilgili filtreden veri dönmeyebilir bunu opsiyonel kılar.
        Brand brand = brandRepository.findById(id).orElseThrow();
        GetBrandResponse getBrandResponse = new GetBrandResponse();
        getBrandResponse.setName(brand.getName());
        return getBrandResponse;
    }
    @PostMapping
    public void add(@RequestBody AddBrandRequest request){
        Brand brand = new Brand();
        brand.setName(request.getName());

        brandRepository.save(brand); //mapping işlemi manual mapping -
    }

    @PutMapping
    public void update (@RequestBody AddBrandRequest addBrandRequest){}

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id){
        //kod buraya geliyorsa exception fırlatmamıştır..
        //Brand brandToDelete = brandRepository.findById(id).orElseThrow();
        //buraya özel kontroller
        //brandRepository.delete(brandToDelete);
        //aşağıdaki kod yukarıdaki yapıyı kullanır
        brandRepository.deleteById(id);
    }
    //DTO = Data Transfer Object

    //her istek için bir Request bir Response modeli bulunmalıdır.
    //AddBrandResponse add(AddBrandRequest request) {}
}
