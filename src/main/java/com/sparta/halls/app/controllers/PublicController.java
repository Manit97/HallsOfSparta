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

    @GetMapping("/roomTypes")
    public String dummyMethod7() {
        return "view/publicPages/roomTypes";
    }

}
