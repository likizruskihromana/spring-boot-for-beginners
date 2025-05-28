package com.tarik.springdemo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public interface StudentService {
    Student save(Student s);
     List<Student> findAllStudents();
    Student findByEmail(String email);
    void delete (String email);
    Student update(Student s);
}
