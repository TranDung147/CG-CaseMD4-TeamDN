package com.example.casem4.service.Phone;

import com.example.casem4.model.Phone;
import com.example.casem4.repository.IPhoneRepository;
import com.example.casem4.service.Phone.imple.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PhoneService implements IPhoneService {
    @Autowired
    private IPhoneRepository phoneRepository;

    @Override
    public Page<Phone> findAll(Pageable pageable) {
        return phoneRepository.findAll(pageable);
    }
    
    // Phương thức tìm kiếm sản phẩm theo tên
    @Override
    public Page<Phone> searchPhonesByName(String name, Pageable pageable) {
        return phoneRepository.findByNameContainingIgnoreCase(name, pageable);
    }

    @Override
    public Phone findById(Integer phoneId) {
        return phoneRepository.findPhoneByPhoneId(phoneId);
    }

    // Tìm kiếm điện thoại
    public Page<Phone> searchPhones(String search, Pageable pageable) {
        return phoneRepository.searchPhones(search, pageable);
    }

    public Phone getPhoneById(Integer phoneId) {
        return phoneRepository.findById(phoneId).orElse(null);
    }

    public void updatePhone(Phone phone) {
        phoneRepository.save(phone);
    }

    public void deletePhone(Integer phoneId) {
        phoneRepository.deleteById(phoneId);
    }

}
