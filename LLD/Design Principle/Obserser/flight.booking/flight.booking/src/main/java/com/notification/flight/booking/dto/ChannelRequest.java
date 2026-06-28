package com.notification.flight.booking.dto;

import com.notification.flight.booking.enums.Channels;

import lombok.Data;

@Data
public class ChannelRequest {
    private String name;
    private Channels channel;
    // getter & setter
}