package com.sparta.halls.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PublicController {
    @GetMapping("/")
    public String dummyMethod() {
        return "view/publicPages/welcome";
    }

    @GetMapping("welcome")
    public String dummyMethod0() {
        return "view/publicPages/welcome";
    }

    @GetMapping("login")
    public String dummyMethod1() {
        return "view/publicPages/login";
    }
}
