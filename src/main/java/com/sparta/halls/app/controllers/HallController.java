package com.sparta.halls.app.controllers;

import com.sparta.halls.app.entities.HallPictures;
import com.sparta.halls.app.entities.Halls;
import com.sparta.halls.app.entities.Pictures;
import com.sparta.halls.app.services.HallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Set;

@Controller
public class HallController {
    private HallService hallService;

    @Autowired
    public HallController(HallService hallService) {
        this.hallService = hallService;
    }
    @GetMapping("/hall")
    public String getHalls(ModelMap modelMap){
        Halls hall = hallService.getDefaultHall();
        Set<HallPictures> hallPictures = hall.getPictures();
        String pictureLocation = "";
        for(HallPictures hallPicture : hallPictures){
           if (hallPicture.getHallId()==1){
                if(hallPicture.getPictureId()==1){
                   pictureLocation = hallPicture.getPicture().getPictureLocation() + hallPicture.getPicture().getPictureName();
               }
           }
        }

        modelMap.addAttribute("hall", hall);
        modelMap.addAttribute("logo", pictureLocation);
        return "databasetester";
    }



}
