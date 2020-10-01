package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.PublicRooms;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicRoomsRepository extends CrudRepository<PublicRooms, Integer> {
}
