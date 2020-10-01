package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.RoomTypes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepository extends CrudRepository<RoomTypes, Integer> {
}
