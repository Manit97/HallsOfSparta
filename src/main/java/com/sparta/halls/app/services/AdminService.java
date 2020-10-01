package com.sparta.halls.app.services;

import com.sparta.halls.app.entities.Admins;
import com.sparta.halls.app.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admins> getAdmins(){
       List<Admins> admins = (List<Admins>) adminRepository.findAll();
       return admins;
    }
}
