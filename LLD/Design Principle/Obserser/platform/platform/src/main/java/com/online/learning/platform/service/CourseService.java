package com.online.learning.platform.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.online.learning.platform.enums.CourseName;
import com.online.learning.platform.model.Course;

@Service
public class CourseService {

    private HashMap<CourseName, Course> courses;

    public CourseService(){
        courses = new HashMap<>();
    }

    public void addCourse(CourseName courseName, String instructorName){

        Course course = new Course();
        course.setCourseName(courseName);
        courses.put(courseName, course);
    }

    public Course getCourseByName(CourseName courseName){
        return courses.get(courseName);
    }


}
