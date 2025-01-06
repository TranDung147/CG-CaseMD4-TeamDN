package com.example.casem4.model.DTO;

import jakarta.validation.constraints.*;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class AppUserDTO implements Validator {

    private int id;

    @NotBlank(message = "Username không được để trống")
    @Size(min = 3, max = 20, message = "Username phải từ 3-20 ký tự")
    @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "Username chỉ được chứa ký tự chữ và số")
    private String username;

    @NotBlank(message = "Password không được để trống")
    @Size(min = 6, message = "Password phải có ít nhất 6 ký tự")
    private String password;

    @NotBlank(message = "Tên không được để trống")
    private String name;

    private String address;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không hợp lệ")
    private String email;

    @NotNull(message = "Số điện thoại không được để trống")
    @Digits(integer = 10, fraction = 0, message = "Số điện thoại phải là số và có tối đa 10 chữ số")
    private Integer phone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return AppUserDTO.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        AppUserDTO userDTO = (AppUserDTO) target;

        // Kiểm tra nếu username chứa khoảng trắng
        if (userDTO.getUsername().contains(" ")) {
            errors.rejectValue("username", "username.space", "Username không được chứa khoảng trắng.");
        }

        // Kiểm tra độ dài mật khẩu
        if (userDTO.getPassword().length() < 6) {
            errors.rejectValue("password", "password.length", "Password phải có ít nhất 6 ký tự.");
        }

        // Kiểm tra độ dài số điện thoại
        if (userDTO.getPhone() != null && String.valueOf(userDTO.getPhone()).length() != 10) {
            errors.rejectValue("phone", "phone.length", "Số điện thoại phải có đúng 10 chữ số.");
        }
    }
}
