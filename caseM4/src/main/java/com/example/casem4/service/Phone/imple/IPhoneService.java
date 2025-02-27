package com.example.casem4.service.Phone.imple;

import com.example.casem4.model.Phone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IPhoneService {
    Page<Phone> findAll(Pageable pageable);
    Page<Phone> searchPhonesByName(String name, Pageable pageable);
    Phone findById(Integer phoneId);
}
