package com.example.casem4.model.DTO;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
public class CartDTO implements Validator {
    private Integer phoneID;
    private String phoneName;
    private String ImgURL;
    private Double phonePrice;
    private Integer quantity;

    public Integer getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(Integer phoneID) {
        this.phoneID = phoneID;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getImgURL() {
        return ImgURL;
    }

    public void setImgURL(String imgURL) {
        ImgURL = imgURL;
    }

    public Double getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(Double phonePrice) {
        this.phonePrice = phonePrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }


}
