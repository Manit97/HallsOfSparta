package com.sparta.halls.app.controllers;

import com.sparta.halls.app.Pages;
import com.sparta.halls.app.Roles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentController {

//    @GetMapping("")
//    public String dummyMethod8() {
//        return "view/studentPages/managementStaff";
//    }

    @GetMapping("/rulesRegulations")
    public String rulesAndRegulationsPage() {
        return Pages.accessPage(Roles.STUDENT, Pages.STUDENT_RULES);
    }

    /*
    @GetMapping("/deletePosts")
    public String deletePostsPage() {
        return Pages.accessPage(Roles.NOMINATED_STUDENT, Pages.NOM_STUDENT_DELETE_POST);
    }
    */

    @GetMapping("/postSuccess")
    public String postSuccessfulPage() {
        return Pages.accessPage(Roles.STUDENT, Pages.STUDENT_POST_SUCCESSFUL);
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
