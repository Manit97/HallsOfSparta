package com.sparta.halls.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/managementStaff")
    public String dummyMethod8() {
        return "view/studentPages/managementStaff";
    }

}
