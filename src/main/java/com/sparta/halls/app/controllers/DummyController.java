package com.sparta.halls.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DummyController {

    @GetMapping("/studentRecords")
    public String dummyMethod1() {
        return "view/adminPages/studentRecords";
    }




}
