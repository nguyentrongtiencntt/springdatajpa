package com.example.education.repository;

import com.example.education.entity.Course;
import com.example.education.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void SaveCourseMaterial(){

        Course course = Course.builder()
                .title("Java")
                .credit(6)
                .build();

        CourseMaterial courseMaterial =
                CourseMaterial
                        .builder()
                        .url("java.com")
                        .course(course)
                        .build();
        repository.save(courseMaterial);
    }
    @Test
    public void printAllCourseMaterial(){
        List<CourseMaterial> materialList = repository.findAll();
        System.out.println("materialList = " + materialList);
    }
}