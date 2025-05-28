package com.tarik.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired //not nessesery
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }
    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email){
        return studentService.findByEmail(email);
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return studentService.update(student);
    }
    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable("email") String email){
        studentService.delete(email);
    }
}
