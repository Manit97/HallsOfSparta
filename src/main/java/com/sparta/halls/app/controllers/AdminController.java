package com.sparta.halls.app.controllers;

import com.sparta.halls.app.entities.Enquiries;
import com.sparta.halls.app.services.EnquiriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AdminController {

    private EnquiriesService enquiriesService;

    @Autowired
    public AdminController(EnquiriesService enquiriesService) {
        this.enquiriesService = enquiriesService;
    }

    @GetMapping("/viewPublicEnquiries")
    public String dummyMethod10(Model model) {
        List<Enquiries> enquiries = enquiriesService.getEnquiriesByType(1);
        model.addAttribute("enquiries", enquiries);
        return "view/adminPages/viewPublicEnquiries";
    }

    @GetMapping("/viewMaintenancePosts")
    public String dummyMethod11(Model model) {
        List<Enquiries> enquiries = enquiriesService.getEnquiriesByType(2);
        model.addAttribute("enquiries", enquiries);
        return "view/adminPages/viewMaintenancePosts";
    }

    @GetMapping("/viewRoomBookings")
    public String dummyMethod12(Model model) {
        List<Enquiries> enquiries = enquiriesService.getEnquiriesByType(3);
        model.addAttribute("enquiries", enquiries);
        return "view/adminPages/viewRoomBookings";
    }
}
