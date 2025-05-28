package com.tarik.springdemo.student;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class InMemoryStudentDao {
    private final List<Student> STUDENTS=new ArrayList<>(List.of(
            new Student(
                    "Tarik",
                    "Rizvić",
                    LocalDate.of(2003, Month.AUGUST,1),
                    "trizvic1@etf.unsa.ba",
                    22),
            new Student(
                    "Hamza",
                    "Kumalić",
                    LocalDate.of(
                            2002,
                            Month.OCTOBER,
                            20),
                    "hkumalic1@etf.unsa.ba",
                    23),
            new Student(
                    "Imad",
                    "Huremović",
                    LocalDate.of(
                            2002,
                            Month.JUNE,
                            26),
                    "ihuremovic1@etf.unsa.ba",
                    23),
            new Student(
                    "Mirza",
                    "Ćatić",
                    LocalDate.of(
                            2002,
                            Month.JUNE,
                            18),
                    "mcatic1@etf.unsa.ba",
                    23),
            new Student(
                    "Emir",
                    "Kapić",
                    LocalDate.of(
                            2002,
                            Month.NOVEMBER,
                            29),
                    "ekapic1@etf.unsa.ba",
                    23)
    ));
    public Student save(Student s) {
        STUDENTS.add(s);
        return s;
    }
    public List<Student> findAllStudents(){
        return STUDENTS;
    }
    public Student findByEmail(String email) {
        return STUDENTS.stream()
                .filter(s->email.equals((s.getEmail())))
                .findFirst()
                .orElse(null);
    }
    public void delete(String email) {
    var student = findByEmail(email);
    if(student!=null){
        STUDENTS.remove(student);
    }
    }
    public Student update(Student s) {
        var studentIndex= IntStream.range(0,STUDENTS.size())
                .filter(index ->STUDENTS.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if(studentIndex>-1){
            STUDENTS.set(studentIndex,s);
            return s;
        }
        return null;
    }
}
