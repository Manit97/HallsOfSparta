package com.sparta.halls.app.controllers;

import com.sparta.halls.app.entities.RoomTypes;
import com.sparta.halls.app.services.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RoomTypeController {
    private RoomTypeService roomTypeService;

    @Autowired
    public RoomTypeController(RoomTypeService roomTypeService){
        this.roomTypeService = roomTypeService;
    }

    @GetMapping("/room")
    public String getRoomType(@RequestParam int roomId, ModelMap modelMap){
        RoomTypes roomType = roomTypeService.getRoomType(roomId).get();
        modelMap.addAttribute("roomType", roomType);
        return "testRooms";
    }
}
