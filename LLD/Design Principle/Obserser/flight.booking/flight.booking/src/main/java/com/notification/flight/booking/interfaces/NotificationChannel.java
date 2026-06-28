package com.notification.flight.booking.interfaces;

import com.notification.flight.booking.enums.Channels;
import com.notification.flight.booking.modle.Notification;
import com.notification.flight.booking.modle.User;

public interface NotificationChannel {

    public Channels getChannelName();

    public void notifyuser(User user, Notification notification);
}
