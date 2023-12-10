package com.tobeto.springProject.controllers;

import com.tobeto.springProject.services.abstracts.BrandService;
import com.tobeto.springProject.services.dtos.request.brand.AddBrandRequest;
import com.tobeto.springProject.entities.Brand;
import com.tobeto.springProject.repositories.BrandRepository;
import com.tobeto.springProject.services.dtos.responses.brand.GetBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/brands")
@AllArgsConstructor
public class BrandsController {
  private final BrandService brandService;

  @GetMapping("{id}")
    public GetBrandResponse getById(@PathVariable int id){
      return this.brandService.getById(id);
  }

  @PostMapping
    public void add (@RequestBody AddBrandRequest request){
      this.brandService.add(request);
  }
}
