package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.Admins;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admins, Integer> {
}
