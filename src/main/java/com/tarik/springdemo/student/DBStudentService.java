package com.tarik.springdemo.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Primary
@Transactional
public class DBStudentService implements StudentService{
    private final StudentRepository studentRepository;
    public DBStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public void delete(String email) {
        studentRepository.deleteByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return studentRepository.save(s);
    }
}
