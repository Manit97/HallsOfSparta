package com.sparta.halls.app.controllers;

import com.sparta.halls.app.entities.HallPictures;
import com.sparta.halls.app.entities.Halls;
import com.sparta.halls.app.entities.Pictures;
import com.sparta.halls.app.entities.RoomTypes;
import com.sparta.halls.app.services.HallService;
import com.sparta.halls.app.services.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

@Controller
public class HallController {
    private HallService hallService;
    private RoomTypeService roomTypeService;

    @Autowired
    public HallController(HallService hallService, RoomTypeService roomTypeService) {
        this.hallService = hallService;
        this.roomTypeService = roomTypeService;
    }
    @GetMapping("halls")
    public String dummyMethod3(ModelMap modelMap) {
        Halls hall = hallService.getDefaultHall();
        modelMap.addAttribute("hall", hall);
        String pictureLocation = "";
        String imageLocation = "";
        Set<HallPictures> hallPictures = hall.getPictures();
        for(HallPictures hallPicture : hallPictures){
            if (hallPicture.getHallId()==1){
                if(hallPicture.getPictureId()==1){
                    pictureLocation = hallPicture.getPicture().getPictureLocation() + hallPicture.getPicture().getPictureName();
                }
                else if(hallPicture.getPictureId()==2){
                    imageLocation = hallPicture.getPicture().getPictureLocation() + hallPicture.getPicture().getPictureName();
                }
            }
        }
        modelMap.addAttribute("logo", pictureLocation);
        modelMap.addAttribute("hallIm", imageLocation);
        return "view/publicPages/halls";
    }
//    @GetMapping("/hall")
//    public String getHalls(ModelMap modelMap){
//        Halls hall = hallService.getDefaultHall();
//        Set<HallPictures> hallPictures = hall.getPictures();
//        String pictureLocation = "";
//        for(HallPictures hallPicture : hallPictures){
//           if (hallPicture.getHallId()==1){
//                if(hallPicture.getPictureId()==1){
//                   pictureLocation = hallPicture.getPicture().getPictureLocation() + hallPicture.getPicture().getPictureName();
//               }
//           }
//        }
//
//        modelMap.addAttribute("hall", hall);
//        modelMap.addAttribute("logo", pictureLocation);
//        return "databasetester";
//    }
    @GetMapping("selectedHall")
    public String dummyMethod4(@RequestParam int hallId, ModelMap modelMap) {
        Halls hall = hallService.getDefaultHall();
        modelMap.addAttribute("hall", hall);
        String pictureLocation = "";
        String imageLocation = "";
        Set<HallPictures> hallPictures = hall.getPictures();
        for(HallPictures hallPicture : hallPictures){
            if (hallPicture.getHallId()==1){
                if(hallPicture.getPictureId()==1){
                    pictureLocation = hallPicture.getPicture().getPictureLocation() + hallPicture.getPicture().getPictureName();
                }
                else if(hallPicture.getPictureId()==2){
                    imageLocation = hallPicture.getPicture().getPictureLocation() + hallPicture.getPicture().getPictureName();
                }
            }
        }
        modelMap.addAttribute("logo", pictureLocation);
        modelMap.addAttribute("hallIm", imageLocation);

        List<RoomTypes> roomTypesList = roomTypeService.getRoomTypes();

        modelMap.addAttribute("roomTypes", roomTypesList);

        return "view/publicPages/selectedHall";
    }


}
