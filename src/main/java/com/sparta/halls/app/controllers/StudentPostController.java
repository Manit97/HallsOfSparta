package com.sparta.halls.app.controllers;

import com.sparta.halls.app.Pages;
import com.sparta.halls.app.Roles;
import com.sparta.halls.app.entities.Enquiries;
import com.sparta.halls.app.entities.Halls;
import com.sparta.halls.app.entities.Student;
import com.sparta.halls.app.entities.StudentPosts;
import com.sparta.halls.app.services.HallService;
import com.sparta.halls.app.services.StudentPostService;
import com.sparta.halls.app.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class StudentPostController {
    private StudentPostService studentPostService;
    private HallService hallService;
    private StudentService studentService;


    @Autowired
    public StudentPostController(StudentPostService studentPostService, HallService hallService, StudentService studentService) {
        this.studentPostService = studentPostService;
        this.hallService = hallService;
        this.studentService=studentService;
    }

    @GetMapping("/studentBoard")
    public String getStudentPosts(Model model){
        List<StudentPosts> posts = studentPostService.getAllStudentPosts();
        ArrayList<StudentPosts> array = new ArrayList<>(posts);
        Collections.reverse(array);
        model.addAttribute("posts", array);
        model.addAttribute("newPost", new StudentPosts());
        return Pages.accessPage(Roles.STUDENT, Pages.STUDENT_NOTICE_BOARD);
    }
    @PostMapping("/studentBoard")
    public String postStudentPost(@ModelAttribute StudentPosts newPost, Model model){
        //studentPostService.addStudentPost(studentPost);
        HttpServletRequest request =
                ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                        .getRequest();

        //String emailName = email.getEmail();
        String emailName = request.getRemoteUser();
        Student student =studentService.getStudentByEmail(emailName);
        newPost.setStudentId(student.getStudentId());
        newPost.setPostDateTime(LocalDateTime.now());
        studentPostService.addStudentPost(newPost);
      
        return Pages.accessPage(Roles.STUDENT, Pages.STUDENT_POST_SUCCESSFUL);
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
        return "view/publicPages/success";
    }

    @GetMapping("/deletePosts")
    public String dummyMethod8(Model model) {
        List<StudentPosts> posts = studentPostService.getAllStudentPosts();
        ArrayList<StudentPosts> array = new ArrayList<>(posts);
        Collections.reverse(array);
        model.addAttribute("posts", array);
        return "view/studentPages/deletePosts";
    }
    @PostMapping("/deletePosts")
    public String deletePost(@RequestParam int postId, Model model){
        studentPostService.deleteStudentPost(postId);
        return "view/studentPages/postSuccess";
    }

//    @GetMapping("/makePost")
//    public String getBookingRequest(Model model){
//        List<Halls> halls = hallService.getAllHalls();
//        model.addAttribute("halls", halls);
//        model.addAttribute("post", new StudentPosts());
//        return ("view/publicPages/error");
//    }
//
//    @PostMapping("/makePost")
//    public String sendBookingRequest(@ModelAttribute StudentPosts studentPost, Model model){
//        studentPostService.addStudentPost(studentPost);
//        return "view/publicPages/welcome";
//    }

//    @GetMapping("/studentBoard")
//    public String dummyMethod7() {
//        return "view/studentPages/studentBoard";
//    }
}
