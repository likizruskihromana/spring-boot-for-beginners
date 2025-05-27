package com.tarik.springdemo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
        return List.of(
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
        );
    }
}
