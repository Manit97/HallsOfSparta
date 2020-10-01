package com.sparta.halls.app.controllers;

import com.sparta.halls.app.Pages;
import com.sparta.halls.app.Roles;
import com.sparta.halls.app.entities.AdminPosts;
import com.sparta.halls.app.entities.Admins;
import com.sparta.halls.app.entities.Noticeboard;
import com.sparta.halls.app.services.AdminPostService;
import com.sparta.halls.app.services.AdminService;
import com.sparta.halls.app.services.NoticeBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class AdminPostController {
    private AdminPostService adminPostService;
    private NoticeBoardService noticeBoardService;
    private AdminService adminService;

    @Autowired
    public AdminPostController(AdminPostService adminPostService, NoticeBoardService noticeBoardService, AdminService adminService) {
        this.adminPostService = adminPostService;
        this.noticeBoardService=noticeBoardService;
        this.adminService=adminService;
    }

    @GetMapping("/adminBoard")
    public String adminNoticeBoard(Model model) {
        List<Noticeboard> posts = noticeBoardService.getAllPosts();
        List<Admins> admins = adminService.getAdmins();
        List<Admins> staff = new ArrayList<>();
        for(Noticeboard post : posts){
            for(AdminPosts ap : post.getAdminPosts()){
                if(ap.getPostId()==post.getPostId()) {
                    staff.add(ap.getAdmin());
                }
            }
        }
        ArrayList<Noticeboard> array= new ArrayList<>(posts);
        Collections.reverse(array);
        model.addAttribute("admins", admins);
        model.addAttribute("posts", array);
        model.addAttribute("newPost", new Noticeboard());
        return Pages.accessPage(Roles.STUDENT, Pages.ADMIN_NOTICE_BOARD);
    }
    @PostMapping("/makePost")
    public String makePost(@ModelAttribute Noticeboard newPost, Model model){
        newPost.setPostDateTime(LocalDateTime.now());
        noticeBoardService.addPost(newPost);
        return Pages.accessPage(Roles.ADMIN, Pages.ADMIN_POST_SUCCESSFUL);
    }

    @PostMapping("/deleteAdminPost")
    public String deletePost(@RequestParam int postId, Model model){
        noticeBoardService.deletePost(postId);
        return Pages.accessPage(Roles.ADMIN, Pages.ADMIN_DELETE_POST_SUCCESSFUL);
    }

    @PostMapping("/assignAdmin")
    public String assignAdmin(@RequestParam int adminId, @RequestParam int postId, Model model){
        AdminPosts adminPosts = new AdminPosts();
        adminPosts.setAdminId(adminId);
        adminPosts.setPostId(postId);
        adminPostService.addPost(adminPosts);
        return Pages.accessPage(Roles.ADMIN, Pages.ADMIN_ASSIGNMENT_SUCCESSFUL);
    }
}
