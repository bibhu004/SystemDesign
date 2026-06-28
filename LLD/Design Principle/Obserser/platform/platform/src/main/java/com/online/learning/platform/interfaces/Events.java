package com.online.learning.platform.interfaces;

import com.online.learning.platform.enums.CourseName;

public interface Events {


    public void subscribe(NotificationChannel notificationChannel);

    public void unsubscribe(NotificationChannel notificationChannel);

    public void publish(CourseName courseName);
}
