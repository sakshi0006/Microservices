package com.microservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String userId;
    private String userName;
    private String userPhoneNumber;
    private Post post;
    private Notification notification;
}
