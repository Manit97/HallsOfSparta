package com.sparta.halls.app.controllers;

import com.sparta.halls.app.services.EnquiriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnquiriesController {

    private EnquiriesService enquiriesService;

    @Autowired
    public EnquiriesController(EnquiriesService enquiriesService) {
        this.enquiriesService = enquiriesService;
    }

    @GetMapping("/enquiries")
    public String getEnquiry(){
        enquiriesService.addTestEnquiry();
        return ("view/publicPages/enquiries");
    }
}
