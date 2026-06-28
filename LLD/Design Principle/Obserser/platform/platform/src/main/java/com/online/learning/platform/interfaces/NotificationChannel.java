package com.online.learning.platform.interfaces;

import com.online.learning.platform.dto.Notification;
import com.online.learning.platform.enums.CourseName;
import com.online.learning.platform.model.Student;

public interface NotificationChannel {

    public void subscribe(Student student);

    public void unsubscribe(Student student);

    public void publish( Notification notification, CourseName courseName);
}
