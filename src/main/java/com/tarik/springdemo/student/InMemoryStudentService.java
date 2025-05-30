package com.tarik.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService{
    @Autowired
    private final InMemoryStudentDao inMemoryStudentDao;
    public InMemoryStudentService(InMemoryStudentDao inMemoryStudentDao) {
        this.inMemoryStudentDao = inMemoryStudentDao;
    }
    @Override
    public Student save(Student s) {
        return inMemoryStudentDao.save(s);
    }
    @Override
    public List<Student> findAllStudents(){
        return inMemoryStudentDao.findAllStudents();
    }
    @Override
    public Student findByEmail(String email) {
        return inMemoryStudentDao.findByEmail(email);
    }
    @Override
    public void delete(String email) {
        inMemoryStudentDao.delete(email);
    }
    @Override
    public Student update(Student s) {
        return inMemoryStudentDao.update(s);
    }
}
