package com.tobeto.springProject.services.concretes;

import com.tobeto.springProject.entities.Brand;
import com.tobeto.springProject.repositories.BrandRepository;
import com.tobeto.springProject.services.abstracts.BrandService;
import com.tobeto.springProject.services.dtos.request.brand.AddBrandRequest;
import com.tobeto.springProject.services.dtos.responses.brand.GetBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandManager implements BrandService {

    private final BrandRepository brandRepository;
    @Override
    public void add(AddBrandRequest request) {
        if(request.getName().length()<2)
            throw new RuntimeException("Marka adı 2 haneden kısa olamaz");

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
