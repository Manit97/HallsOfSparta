package com.sparta.halls.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

//    @GetMapping("")
//    public String dummyMethod8() {
//        return "view/studentPages/managementStaff";
//    }

    @GetMapping("/rulesRegulations")
    public String dummyMethod9() {
        return "view/studentPages/rulesRegulations";
    }

//    @GetMapping("/maintenanceRequest")
//    public String dummyMethod10() {
//        return "view/studentPages/maintenanceRequest";
//    }
//
//    @GetMapping("/roomBooking")
//    public String dummyMethod11() {
//        return "view/studentPages/roomBooking";
//    }


}
