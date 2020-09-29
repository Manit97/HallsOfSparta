package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.Halls;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallsRepository extends CrudRepository<Halls, Integer> {

}
