package com.example.education.repository;

import com.example.education.entity.Course;
import com.example.education.entity.CourseMaterial;
import com.example.education.entity.Student;
import com.example.education.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository repository;

    @Test
    public void printAllCourse(){
        List<Course> courses = repository.findAll();
        System.out.println("courses = " + courses);
    }

    @Test
    public void saveCourseWithTeacher(){

        Teacher teacher =
                Teacher.builder()
                        .name("Tien")
                        //.courses(List.of(course))
                        .build();
        Course course = Course.builder()
                .title("Javascript")
                .credit(5)
                .teacher(teacher)
                .build();

        repository.save(course);
    }

    @Test
    public void saveCourseWithStudentAndTeacher(){
        Teacher teacher = Teacher
                .builder()
                .name("Austin")
                .build();

        Student student = Student
                .builder()
                .firstName("Nguyen")
                .lastName("Khoi")
                .emailId("ntk@gmail.com")
                .build();

        Course course = Course
                .builder()
                .title("AI")
                .teacher(teacher)
                .build();
        course.addStudents(student);
        repository.save(course);
    }
}