package com.online.learning.platform.controller;

import com.online.learning.platform.enums.CourseName;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.online.learning.platform.service.CourseService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api/course")
public class CoruseController {

  
    private CourseService courseService;

    public CoruseController(CourseService courseService){
        this.courseService = courseService;
    }

    @PostMapping("/add")
    public String postMethodName(@RequestParam CourseName courseName,@RequestParam String instructorNam ) {
        //TODO: process POST request
        courseService.addCourse(courseName, instructorNam);
        return "Course added";
    }
    

}
