package com.sparta.halls.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PublicController {

    @GetMapping("/welcome")
    public String dummyMethod5() {
        return "view/publicPages/welcome";
    }

//    @GetMapping("/success")
//    public String dummyMethod6() {
//        return "view/publicPages/success";
//    }


//    @GetMapping("/postSuccess")
//    public String dummyMethod9() {
//        return "view/studentPages/postSuccess";
//    }

    @GetMapping("/viewPublicEnquiries")
    public String dummyMethod10() {
        return "view/adminPages/viewPublicEnquiries";
    }

    @GetMapping("/viewMaintenancePosts")
    public String dummyMethod11() {
        return "view/adminPages/viewMaintenancePosts";
    }

    @GetMapping("/viewRoomBookings")
    public String dummyMethod12() {
        return "view/adminPages/viewRoomBookings";
    }

    @GetMapping("/deleteSuccess")
    public String dummyMethod13() {
        return "view/studentPages/deleteSuccess";
    }



}
