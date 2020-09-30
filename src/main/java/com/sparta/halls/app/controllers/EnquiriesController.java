package com.sparta.halls.app.controllers;

import com.sparta.halls.app.entities.Enquiries;
import com.sparta.halls.app.entities.Halls;
import com.sparta.halls.app.services.EnquiriesService;
import com.sparta.halls.app.services.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EnquiriesController {

    private EnquiriesService enquiriesService;
    private HallService hallService;

    @Autowired
    public EnquiriesController(EnquiriesService enquiriesService, HallService  hallService) {
        this.enquiriesService = enquiriesService;
        this.hallService = hallService;
    }

    @GetMapping("/enquiries")
    public String getEnquiry(Model model){
        List<Halls> halls = hallService.getAllHalls();
        //enquiriesService.addTestEnquiry();
        model.addAttribute("halls", halls);
        model.addAttribute("enquiry", new Enquiries());
        return ("view/publicPages/enquiries");
    }

    @PostMapping("/enquiries")
    public String sendEnquiry(@ModelAttribute Enquiries enquiry, Model model){
        enquiriesService.addEnquiry(enquiry);
        return "view/publicPages/welcome";
    }
}
