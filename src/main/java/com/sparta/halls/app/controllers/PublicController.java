package com.sparta.halls.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("enquiries")
    public String dummyMethod2() {
        return "view/publicPages/enquiries";
    }

    @GetMapping("halls")
    public String dummyMethod3() {
        return "view/publicPages/halls";
    }

    @GetMapping("selectedHall")
    public String dummyMethod4() {
        return "view/publicPages/selectedHall";
    }
}
