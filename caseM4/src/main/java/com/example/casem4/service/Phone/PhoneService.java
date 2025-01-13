package com.example.casem4.service.Phone;

import com.example.casem4.model.Brand;
import com.example.casem4.model.Phone;
import com.example.casem4.repository.IBrandRepository;
import com.example.casem4.repository.IPhoneRepository;
import com.example.casem4.service.Phone.imple.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhoneService implements IPhoneService {
    @Autowired
    private IPhoneRepository phoneRepository;

    @Override
    public Page<Phone> findAll(Pageable pageable) {
        return phoneRepository.findAll(pageable);
    }

    @Override
    public Phone findById(Integer phoneId) {
        return phoneRepository.findPhoneByPhoneId(phoneId);
    }

}
