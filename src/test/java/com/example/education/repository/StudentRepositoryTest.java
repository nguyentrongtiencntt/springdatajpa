package com.example.education.repository;

import com.example.education.entity.Guardian;
import com.example.education.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("ntt@gmail.com")
                .firstName("Nguyen")
                .lastName("Tien")
                .build();

        studentRepository.save(student);
    }
    @Test
    public void saveStudentwithGuardian(){
        Guardian guardian = Guardian.builder()
                .email("nta@gmail.com")
                .name("Doan")
                .mobile("0909260517")
                .build();

        Student student = Student.builder()
                .emailId("nta@gmail.com")
                .firstName("Nguyen")
                .lastName("Tien")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printAllStudent(){
        List<Student> studentList =
                studentRepository.findAll();
        System.out.println("student list" + studentList );

    }

}