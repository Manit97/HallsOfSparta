package com.sparta.halls.app.controllers;

import com.sparta.halls.app.Pages;
import com.sparta.halls.app.Roles;
import org.springframework.web.bind.annotation.GetMapping;

public class NoticeBoardController {

    @GetMapping("/deleteSuccess")
    public String dummyMethod13() {
        return Pages.accessPage(Roles.STUDENT, Pages.NOM_STUDENT_DELETE_SUCCESS);
    }
}
