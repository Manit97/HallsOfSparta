package com.sparta.halls.app.services;

import com.sparta.halls.app.entities.AdminPosts;
import com.sparta.halls.app.repositories.AdminPostsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminPostService {

    private final AdminPostsRepository adminPostsRepository;

    public AdminPostService(AdminPostsRepository adminPostsRepository) {
        this.adminPostsRepository = adminPostsRepository;
    }

    public List<AdminPosts> getAllPosts(){
       List<AdminPosts> posts = (List<AdminPosts>)adminPostsRepository.findAll();
       return posts;
    }

    public boolean addPost(AdminPosts adminPost){
        adminPostsRepository.save(adminPost);
        return true;
    }

}
