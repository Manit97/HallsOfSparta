package com.sparta.halls.app.controllers;

import com.sparta.halls.app.entities.HallPictures;
import com.sparta.halls.app.entities.RoomTypePictures;
import com.sparta.halls.app.entities.RoomTypes;
import com.sparta.halls.app.services.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@Controller
public class RoomController {

    private RoomTypeService roomTypeService;

    @Autowired
    public RoomController(RoomTypeService roomTypeService) {
        this.roomTypeService = roomTypeService;
    }
    @GetMapping("/selectedRoom")
    public String getSelectedRoom(@RequestParam int roomId, ModelMap modelMap){
        RoomTypes roomType = roomTypeService.getRoomType(roomId).get();
        modelMap.addAttribute("room", roomType);
        String pictureLocation = "";
        String imageLocation = "";
        Set<RoomTypePictures> roomPictures = roomType.getRoomTypePictures();
        for(RoomTypePictures roomPicture : roomPictures){
            if (roomPicture.getRoomTypeId()==roomId){
                if(roomPicture.getPictureId()==1){
                    pictureLocation = roomPicture.getPicture().getPictureLocation() + roomPicture.getPicture().getPictureName();
                }
                else if(roomPicture.getPictureId()==2){
                    imageLocation = roomPicture.getPicture().getPictureLocation() + roomPicture.getPicture().getPictureName();
                }
            }
        }
        modelMap.addAttribute("logo", pictureLocation);
        modelMap.addAttribute("roomIm", imageLocation);
        return "view/publicPages/selectedRoom";
    }

}
