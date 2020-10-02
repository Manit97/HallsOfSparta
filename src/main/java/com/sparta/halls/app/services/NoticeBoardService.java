package com.sparta.halls.app.services;

import com.sparta.halls.app.entities.Noticeboard;
import com.sparta.halls.app.repositories.NoticeboardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeBoardService {
    private final NoticeboardRepository noticeboardRepository;

    public NoticeBoardService(NoticeboardRepository noticeboardRepository) {
        this.noticeboardRepository = noticeboardRepository;
    }
    public List<Noticeboard> getAllPosts(){
        List<Noticeboard> posts = (List<Noticeboard>) noticeboardRepository.findAll();
        return posts;
    }

    public void addPost(Noticeboard noticeboard){
        noticeboardRepository.save(noticeboard);
    }
    public void deletePost(int id){
        noticeboardRepository.deleteById(id);
    }
}
