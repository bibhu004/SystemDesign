package com.online.learning.platform.model;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.online.learning.platform.dto.Notification;
import com.online.learning.platform.enums.CourseName;
import com.online.learning.platform.enums.NotificationChannels;
import com.online.learning.platform.enums.Role;
import com.online.learning.platform.interfaces.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student implements User{

    private long id;
    private String name;
    private Role role;
    private List<NotificationChannels> notificationChannels;
    private List<Notification> notificationHistory;
    private HashMap<CourseName, Course> courses;

}
