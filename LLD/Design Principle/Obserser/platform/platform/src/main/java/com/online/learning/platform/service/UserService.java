package com.online.learning.platform.service;

import com.online.learning.platform.model.Course;
import com.online.learning.platform.model.Instructor;
import com.online.learning.platform.model.Student;
import com.online.learning.platform.registry.ChannelRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.online.learning.platform.dto.UserDto;
import com.online.learning.platform.enums.CourseName;
import com.online.learning.platform.enums.NotificationChannels;
import com.online.learning.platform.enums.Role;
import com.online.learning.platform.interfaces.NotificationChannel;
import com.online.learning.platform.interfaces.User;

@Service
public class UserService {


    private final Student student;
    private CourseService courseService;
    private ChannelRegistry channelRegistry;
    List<User> users;

    public UserService(Student student, CourseService courseService, ChannelRegistry channelRegistry){
        this.users = new ArrayList<>();
        this.student = student;
        this.courseService = courseService;
        this.channelRegistry = channelRegistry;
    }

    public void addUser(UserDto userDto ){
        if(userDto.getRole().equals(Role.STUDENT) ){
            Student student = new Student();
            student.setName(userDto.getName());
            student.setRole(userDto.getRole());

            HashMap<CourseName, Course> courses = new HashMap<>();

            for(CourseName courseName : userDto.getCourses()){
                courses.put(courseName, courseService.getCourseByName(courseName));
            }

            student.setCourses(courses);
            student.setNotificationChannels(userDto.getNotificationChannels());

            for(NotificationChannels notificationChannels : student.getNotificationChannels()){
                NotificationChannel prefferedChannel = channelRegistry.getChannel(notificationChannels);
                prefferedChannel.subscribe(student);
            }

            users.add(student);
        }
        else if(userDto.getRole().equals(Role.INSTRUCTOR)){
            Instructor instructor = new Instructor();
            instructor.setName(userDto.getName());
            instructor.setRole(Role.INSTRUCTOR);

            users.add(instructor);
        }
    }
}
