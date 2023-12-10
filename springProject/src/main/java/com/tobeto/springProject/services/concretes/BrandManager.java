package com.tobeto.springProject.services.concretes;

import com.tobeto.springProject.entities.Brand;
import com.tobeto.springProject.repositories.BrandRepository;
import com.tobeto.springProject.services.abstracts.BrandService;
import com.tobeto.springProject.services.dtos.request.brand.AddBrandRequest;
import com.tobeto.springProject.services.dtos.responses.brand.GetBrandResponse;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BrandManager implements BrandService {

    private final BrandRepository brandRepository;
    @Override
    public void add(AddBrandRequest request) {

        Brand brand = new Brand();
        brand.setName(request.getName()); //kullanıcıdan brand bilgisini al > sunucuya istek gönder > requestle veritabanına yaz
        brandRepository.save(brand);
    }

    @Override
    public GetBrandResponse getById(int id) {
        Brand brand = brandRepository.findById(id).orElseThrow();
        GetBrandResponse getBrandResponse = new GetBrandResponse();
        getBrandResponse.setName(brand.getName());
        return getBrandResponse;
    }
}
