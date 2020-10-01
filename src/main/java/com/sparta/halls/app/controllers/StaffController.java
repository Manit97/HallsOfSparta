package com.sparta.halls.app.controllers;

import com.sparta.halls.app.Pages;
import com.sparta.halls.app.Roles;
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

    @GetMapping("/managementStaff")
    public String getManagement(ModelMap modelMap){
        List<Admins> admins = adminService.getAdmins();
        modelMap.addAttribute("admins", admins);
        return Pages.accessPage(Roles.STUDENT, Pages.STUDENT_VIEW_MANAGEMENT);
    }
}
