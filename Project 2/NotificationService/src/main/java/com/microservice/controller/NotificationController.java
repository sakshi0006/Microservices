package com.microservice.controller;

import com.microservice.model.Notification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    @GetMapping(value = "/{notificationId}")
    public Notification getNotifications(@PathVariable("notificationId") String notificationId){
        return new Notification(notificationId, "Notification description for "+notificationId);
    }
}
