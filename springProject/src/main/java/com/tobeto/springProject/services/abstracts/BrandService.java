package com.tobeto.springProject.services.abstracts;

import com.tobeto.springProject.services.dtos.request.brand.AddBrandRequest;
import com.tobeto.springProject.services.dtos.responses.brand.GetBrandResponse;

public interface BrandService {
    void add(AddBrandRequest request);
    GetBrandResponse getById(int id);
}
