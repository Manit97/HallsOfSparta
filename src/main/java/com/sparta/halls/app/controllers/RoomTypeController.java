package com.sparta.halls.app.controllers;

import com.sparta.halls.app.Pages;
import com.sparta.halls.app.Roles;
import com.sparta.halls.app.entities.RoomTypePictures;
import com.sparta.halls.app.entities.RoomTypes;
import com.sparta.halls.app.services.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/roomTypes")
    public String dummyMethod7(ModelMap modelMap) {
        List<RoomTypes> roomTypesList = roomTypeService.getRoomTypes();
        Map<Integer, String> roomPictureList = new HashMap<>();
        for(RoomTypes roomType: roomTypesList) {
            for (RoomTypePictures roomPicture : roomType.getRoomTypePictures()) {
                roomPictureList.put(roomType.getRoomTypeId(), roomPicture.getPicture().getPictureLocation() + roomPicture.getPicture().getPictureName());
            }
        }

        modelMap.addAttribute("rooms", roomTypesList);
        modelMap.addAttribute("roomPics", roomPictureList);
        return Pages.accessPage(Roles.PUBLIC, Pages.PUBLIC_VIEW_ROOM_TYPES);
    }
}
