package com.online.learning.platform.dto;

import java.util.List;



import com.online.learning.platform.enums.CourseName;
import com.online.learning.platform.enums.NotificationChannels;
import com.online.learning.platform.enums.Role;
import com.online.learning.platform.model.Course;

import lombok.Data;

@Data
public class UserDto {


    private String name;
    private Role role;
    private List<NotificationChannels> notificationChannels;
    private List<CourseName> courses;
}
