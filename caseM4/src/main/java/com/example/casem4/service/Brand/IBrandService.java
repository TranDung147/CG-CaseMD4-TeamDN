package com.example.casem4.service.Brand;

import com.example.casem4.model.Brand;
import java.util.List;

public interface IBrandService {
    List<Brand> getAllBrands();
    Brand getBrandById(int brandId);
}
