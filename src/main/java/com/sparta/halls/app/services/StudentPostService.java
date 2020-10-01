package com.sparta.halls.app.services;

import com.sparta.halls.app.entities.StudentPosts;
import com.sparta.halls.app.repositories.StudentPostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  StudentPostService {
    private final StudentPostsRepository studentPostsRepository;

    @Autowired
    public StudentPostService(StudentPostsRepository studentPostsRepository) {
        this.studentPostsRepository = studentPostsRepository;
    }

    public List<StudentPosts> getAllStudentPosts(){
        List<StudentPosts> posts = (List<StudentPosts>) studentPostsRepository.findAll();
        return posts;
    }

    public boolean deleteStudentPost(int postId){
        studentPostsRepository.deleteById(postId);
        return true;
    }

    public void addStudentPost(StudentPosts studentPost){
        studentPostsRepository.save(studentPost);
    }
}
