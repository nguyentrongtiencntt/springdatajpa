package com.example.education.repository;

import com.example.education.entity.Course;
import com.example.education.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository repository;

    @Test
    public void saveTeacher(){
        Course course = Course.builder()
                .title("C#")
                .credit(5)
                .build();

        Teacher teacher =
                Teacher.builder()
                        .name("Tien")
                        //.courses(List.of(course))
                        .build();

        repository.save(teacher);

    }

    @Test
    public void findTeacher(){
        List<Teacher> teachers = repository.findAll();
        System.out.println("teachers = " + teachers);
    }


}