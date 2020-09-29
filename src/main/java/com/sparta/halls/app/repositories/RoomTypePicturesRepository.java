package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.RoomTypePictures;
import com.sparta.halls.app.entities.RoomTypePicturesPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypePicturesRepository extends CrudRepository<RoomTypePictures, RoomTypePicturesPK> {

}
