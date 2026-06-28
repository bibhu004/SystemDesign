package com.online.learning.platform.model;

import java.util.List;

import org.springframework.stereotype.Component;

import com.online.learning.platform.enums.CourseName;
import com.online.learning.platform.enums.Role;

import lombok.Data;

@Data
@Component
public class Course {


    private long id;
    private CourseName courseName;
    private Instructor instructor;
    private List<Student> students;


    public void enroll(Student student){
        students.add(student);
    }

    public void optOut(Student student){
        students.remove(student);
    }
}
