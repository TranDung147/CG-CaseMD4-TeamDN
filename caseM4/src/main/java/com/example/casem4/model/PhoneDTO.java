package com.example.casem4.model;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class PhoneDTO implements Validator {

    private Integer id;

    @NotBlank
    @Size(min = 5, max = 20, message = "Tên chỉ từ 5 đến 20 kí tự")
    @Pattern(regexp = "^[A-Z][a-zA-Z0-9\\s]", message = "Tên không chứa kí tự đặc biệt và in hoa chữ cái đầu!")
    private String name;

//    xử lý bằng dropdown trên FE ( 128, 256, 512, 1024)
    private Integer capacity;

//    xử lý bằng dropdown trên FE ( 4, 8)
    private Integer ram;

    private String color;

    private Double price;

    private String origin;

    private Brand brand;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
//        xử lý validate thì code vào đây
    }

}
