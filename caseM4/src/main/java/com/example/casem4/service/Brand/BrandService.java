package com.example.casem4.service.Brand;

import com.example.casem4.model.Brand;
import com.example.casem4.repository.IBrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService implements IBrandService {

    private final IBrandRepository brandRepository;

    @Autowired
    public BrandService(IBrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getBrandById(int brandId) {
        return brandRepository.findById(brandId).orElse(null);
    }


}
