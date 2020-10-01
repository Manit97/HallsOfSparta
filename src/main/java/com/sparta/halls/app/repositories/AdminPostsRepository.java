package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.AdminPosts;
import com.sparta.halls.app.entities.AdminPostsPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminPostsRepository extends CrudRepository<AdminPosts, AdminPostsPK> {
}
