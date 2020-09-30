package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.HallPictures;
import com.sparta.halls.app.entities.HallPicturesPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallPicturesRepository extends CrudRepository<HallPictures, HallPicturesPK> {

}
