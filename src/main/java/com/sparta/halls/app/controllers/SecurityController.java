package com.sparta.halls.app.controllers;

import com.sparta.halls.app.Pages;
import com.sparta.halls.app.Roles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/")
    public String dummyMethod() {
        return Pages.accessPage(Roles.PUBLIC, Pages.PUBLIC_WELCOME);
    }

    @GetMapping("/login")
    public String loginPage() {
        return Pages.accessPage(Roles.PUBLIC, Pages.PUBLIC_LOGIN);
    }

    @GetMapping("/logout")
    public String logoutPage() {
        return Pages.accessPage(Roles.PUBLIC, Pages.PUBLIC_LOGOUT);
    }

    /*
    @GetMapping("/signedin")
    public String signedinPage() {
        return "view/publicPages/signedin";
    }
    */

    @GetMapping("/error")
    public String errorPage() {
        return Pages.accessPage(Roles.PUBLIC, Pages.ERROR_PAGE);
    }
}
