package com.sparta.halls.app.services;

import com.sparta.halls.app.entities.RoomTypes;
import com.sparta.halls.app.repositories.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomTypeService {
    private final RoomTypeRepository roomTypeRepository;

    @Autowired
    public RoomTypeService(RoomTypeRepository roomTypeRepository) {
        this.roomTypeRepository = roomTypeRepository;
    }

    public List<RoomTypes> getRoomTypes(){
        List<RoomTypes> roomTypes= (List<RoomTypes>) roomTypeRepository.findAll();
        return roomTypes;
    }

    public Optional<RoomTypes> getRoomType(int id){
        return roomTypeRepository.findById(id);
    }
}
