package com.sparta.halls.app.services;

import com.sparta.halls.app.entities.Student;
import com.sparta.halls.app.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentByEmail(String email){
        Student student = studentRepository.getStudentByEmail(email);
        return student;
    }

    public boolean addStudent(Student student){
        studentRepository.save(student);
        return true;
    }

    public boolean deleteStudent(int id){
        studentRepository.deleteById(id);
        return true;
    }

    public boolean updateStudent(Student student){
        studentRepository.save(student);
        return true;
    }
}
