package com.sparta.halls.app.repositories;

import com.sparta.halls.app.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
    Student getStudentByEmail(String email);
}
