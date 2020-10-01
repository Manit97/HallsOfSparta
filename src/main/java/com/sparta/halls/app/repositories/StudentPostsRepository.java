package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.StudentPosts;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentPostsRepository extends CrudRepository<StudentPosts, Integer> {
}
