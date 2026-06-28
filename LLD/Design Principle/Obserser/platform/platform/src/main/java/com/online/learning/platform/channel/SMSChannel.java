package com.online.learning.platform.channel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.online.learning.platform.dto.Notification;
import com.online.learning.platform.enums.CourseName;
import com.online.learning.platform.interfaces.NotificationChannel;
import com.online.learning.platform.model.Course;
import com.online.learning.platform.model.Student;

public class SMSChannel implements NotificationChannel {

    List<Student> subscribers;

    public SMSChannel(){
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Student student ){
        this.subscribers.add(student);
    }

    @Override
    public void unsubscribe(Student student){
        this.subscribers.remove(student);
    }

@Override
    public void publish( Notification notification, CourseName courseName){
        //yet to implement
        for(Student student : subscribers){
            HashMap<CourseName, Course> courses = student.getCourses();

            if(!courses.containsKey(courseName))
                continue;
            notification.setReciever(student.getName());
            System.out.println("SMS notificaiton sent to - " + student.getName());
        }
    }
}