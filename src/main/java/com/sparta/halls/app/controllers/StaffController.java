package com.sparta.halls.app.controllers;

import com.sparta.halls.app.entities.Admins;
import com.sparta.halls.app.services.AdminService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StaffController {
    private AdminService adminService;

    public StaffController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/staff")
    public String getManagement(ModelMap modelMap){
        List<Admins> admins = adminService.getAdmins();
        modelMap.addAttribute("admins", admins);
        return"view/publicPages/error";
    }
}
