package com.sparta.halls.app.services;


import com.sparta.halls.app.entities.Halls;
import com.sparta.halls.app.repositories.HallsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HallService {
    private final HallsRepository hallsRepository;

    @Autowired
    public HallService(HallsRepository hallsRepository){
        this.hallsRepository = hallsRepository;
    }

    public Halls getDefaultHall(){
        List<Halls> halls= (List<Halls>) hallsRepository.findAll();
        return halls.get(0);
    }

}
