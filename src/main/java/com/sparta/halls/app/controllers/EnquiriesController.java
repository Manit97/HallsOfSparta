package com.sparta.halls.app.controllers;

import com.sparta.halls.app.Pages;
import com.sparta.halls.app.Roles;
import com.sparta.halls.app.entities.Enquiries;
import com.sparta.halls.app.entities.Halls;
import com.sparta.halls.app.entities.PublicRooms;
import com.sparta.halls.app.services.EnquiriesService;
import com.sparta.halls.app.services.HallService;
import com.sparta.halls.app.services.PublicRoomsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EnquiriesController {

    private EnquiriesService enquiriesService;
    private HallService hallService;
    private PublicRoomsService publicRoomsService;

    @Autowired
    public EnquiriesController(EnquiriesService enquiriesService, HallService  hallService, PublicRoomsService publicRoomsService) {
        this.enquiriesService = enquiriesService;
        this.hallService = hallService;
        this.publicRoomsService = publicRoomsService;
    }

    @GetMapping("/enquiries")
    public String getEnquiry(Model model){
        List<Halls> halls = hallService.getAllHalls();
        //enquiriesService.addTestEnquiry();
        model.addAttribute("halls", halls);
        model.addAttribute("enquiry", new Enquiries());
        return Pages.accessPage(Roles.PUBLIC, Pages.PUBLIC_ENQUIRIES);
    }

    @PostMapping("/enquiries")
    public String sendEnquiry(@ModelAttribute Enquiries enquiry, Model model){
        enquiry.setEnquiryTypeId(1);
        enquiriesService.addEnquiry(enquiry);
        return Pages.accessPage(Roles.PUBLIC, Pages.PUBLIC_ENQUIRY_SENT);
    }

    @GetMapping("/maintenanceRequest")
    public String getMaintenanceRequest(Model model){
        List<Halls> halls = hallService.getAllHalls();
        model.addAttribute("halls", halls);
        model.addAttribute("enquiry", new Enquiries());
        return Pages.accessPage(Roles.STUDENT, Pages.STUDENT_MAINTENANCE_REQUEST);
    }

    @PostMapping("/maintenanceRequest")
    public String sendMaintenanceRequest(@ModelAttribute Enquiries enquiry, Model model){
        enquiry.setEnquiryTypeId(2);
        enquiriesService.addEnquiry(enquiry);
        return Pages.accessPage(Roles.STUDENT, Pages.STUDENT_REQUEST_SENT);
    }
    @GetMapping("/roomBooking")
    public String getBookingRequest(Model model){
        List<Halls> halls = hallService.getAllHalls();
        List<PublicRooms> rooms = publicRoomsService.getAllRooms();
        model.addAttribute("halls", halls);
        model.addAttribute("rooms", rooms);
        model.addAttribute("enquiry", new Enquiries());
        return Pages.accessPage(Roles.STUDENT, Pages.STUDENT_BOOKING_REQUEST);
    }

    @PostMapping("/roomBooking")
    public String sendBookingRequest(@ModelAttribute Enquiries enquiry, Model model){
        enquiry.setEnquiryTypeId(3);
        enquiriesService.addEnquiry(enquiry);
        return Pages.accessPage(Roles.STUDENT, Pages.STUDENT_REQUEST_SENT);
    }


}
