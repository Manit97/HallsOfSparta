package com.sparta.halls.app.controllers;

import com.sparta.halls.app.entities.Enquiries;
import com.sparta.halls.app.entities.Halls;
import com.sparta.halls.app.entities.StudentPosts;
import com.sparta.halls.app.services.HallService;
import com.sparta.halls.app.services.StudentPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class StudentPostController {
    private StudentPostService studentPostService;
    private HallService hallService;

    @Autowired
    public StudentPostController(StudentPostService studentPostService, HallService hallService) {
        this.studentPostService = studentPostService;
        this.hallService = hallService;
    }

    @GetMapping("/studentPosts")
    public String getStudentPosts(ModelMap modelMap){
        List<StudentPosts> posts = studentPostService.getAllStudentPosts();
        modelMap.addAttribute("posts", posts);
        return "view/publicPages/error";
    }
    @GetMapping("/studentPostsModeration")
    public String getStudentPostsModeration(ModelMap modelMap){
        List<StudentPosts> posts = studentPostService.getAllStudentPosts();
        modelMap.addAttribute("posts", posts);
        return "view/publicPages/error";
    }
    @PostMapping("/studentPostsModeration")
    public String getModeration(@RequestParam int postId, ModelMap modelMap){
        studentPostService.deleteStudentPost(postId);
        return "view/publicPages/error";
    }

    @GetMapping("/makePost")
    public String getBookingRequest(Model model){
        List<Halls> halls = hallService.getAllHalls();
        model.addAttribute("halls", halls);
        model.addAttribute("post", new StudentPosts());
        return ("view/publicPages/error");
    }

    @PostMapping("/makePost")
    public String sendBookingRequest(@ModelAttribute StudentPosts studentPost, Model model){
        studentPostService.addStudentPost(studentPost);
        return "view/publicPages/welcome";
    }
}
