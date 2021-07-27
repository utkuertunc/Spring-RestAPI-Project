package com.utkuertunc.rest.services;

import java.util.List;
import java.util.Optional;
import com.utkuertunc.rest.models.Student;

public interface IStudent {
	
    List<Student> getAllStudents();
    Optional<Student> findById(int id);
    Optional<Student> findByEmail(String email);
    Student save(Student std);
    void deleteById(int id);
    
}