package com.example.casem4.service.AppUser;

import com.example.casem4.model.AppRole;
import com.example.casem4.model.AppUser;
import com.example.casem4.model.DTO.AppUserDTO;
import com.example.casem4.model.UserDetail;
import com.example.casem4.repository.IAppRoleRepository;
import com.example.casem4.repository.IAppUserDetailRepository;
import com.example.casem4.repository.IAppUserRepository;
import com.example.casem4.service.AppUser.imple.IAppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService implements IAppUserService {

    @Autowired
    private IAppUserRepository appUserRepository;

    @Autowired
    private IAppUserDetailRepository appUserDetailRepository;

    @Autowired
    private IAppRoleRepository appRoleRepository;

    // Xác thực người dùng
    @Override
    public boolean authenticateUser(String username, String password) {
        AppUser appUser = appUserRepository.findByUsername(username);
        return appUser != null && appUser.getPassword().equals(password);
    }

    // Đăng ký người dùng
    @Override
    public boolean registerUser(AppUserDTO appUserDTO) {
        if (appUserRepository.findByUsername(appUserDTO.getUsername()) != null) {
            return false;
        }
        AppRole defaultRole = appRoleRepository.findByRole("USER");
        if (defaultRole == null) {
            return false;
        }
        AppUser appUser = new AppUser();
        appUser.setUsername(appUserDTO.getUsername());
        appUser.setPassword(appUserDTO.getPassword());
        appUser.setRole(defaultRole);
        appUserRepository.save(appUser);
        return true;
    }

    // Kiểm tra người dùng theo username
    public boolean checkUserByUsername(String username) {
        return appUserRepository.findByUsername(username) != null;
    }

    // Kiểm tra người dùng theo email
    public boolean checkUserByEmail(String email) {
        return appUserDetailRepository.findByEmail(email) != null;
    }

    // Reset mật khẩu
    @Override
    public boolean resetPassword(String email) {
        UserDetail userDetail = appUserDetailRepository.findByEmail(email);
        if (userDetail != null) {
            System.out.println("Email reset password sent to: " + email);
            return true;
        }
        return false;
    }

    // Thêm phương thức lấy thông tin chi tiết người dùng
    public UserDetail getUserDetailById(Integer id) {
        return appUserDetailRepository.findById(id).orElse(null);
    }
}
