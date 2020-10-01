package com.sparta.halls.app.services;

import com.sparta.halls.app.entities.PublicRooms;
import com.sparta.halls.app.repositories.PublicRoomsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicRoomsService {
    private final PublicRoomsRepository publicRoomsRepository;

    @Autowired
    public PublicRoomsService(PublicRoomsRepository publicRoomsRepository) {
        this.publicRoomsRepository = publicRoomsRepository;
    }

    public List<PublicRooms> getAllRooms(){
        List<PublicRooms> rooms = (List<PublicRooms>) publicRoomsRepository.findAll();
        return rooms;
    }
}
