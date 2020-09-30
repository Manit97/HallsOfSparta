package com.sparta.halls.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/")
    public String dummyMethod() {
        return "view/publicPages/landing";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "view/publicPages/login";
    }

    @GetMapping("/signedin")
    public String signedinPage() {
        return "view/publicPages/signedin";
    }

    @GetMapping("/error")
    public String errorPage() {
        return "view/publicPages/error";
    }
}