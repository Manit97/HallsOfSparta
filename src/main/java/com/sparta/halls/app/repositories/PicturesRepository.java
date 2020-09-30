package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.Pictures;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PicturesRepository extends CrudRepository<Pictures, Integer> {
}
