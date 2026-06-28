package com.online.learning.platform.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Notification {

    private String sender;
    private String reciever;
    private String channel;
    private String title;
    private String message;
    private Date timestamp;
    private String status;
}
