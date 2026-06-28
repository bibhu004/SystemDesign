package com.online.learning.platform.model;

import org.springframework.stereotype.Component;

import com.online.learning.platform.enums.Role;
import com.online.learning.platform.interfaces.User;

import lombok.Data;

@Data
@Component
public class Instructor implements User{

    private String name;
    private Role role;
}
