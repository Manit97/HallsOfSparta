package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.Noticeboard;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeboardRepository extends CrudRepository<Noticeboard, Integer> {

}
