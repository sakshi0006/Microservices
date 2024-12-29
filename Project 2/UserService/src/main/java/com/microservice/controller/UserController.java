package com.microservice.controller;

import com.microservice.model.Notification;
import com.microservice.model.Post;
import com.microservice.model.User;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    public static final String USER_SERVICE = "user-service";

    @GetMapping(value="/{userId}")
    @CircuitBreaker(name = USER_SERVICE, fallbackMethod = "userServiceFallBack")
    public User getUser(@PathVariable("userId") String userId){

        Post post = restTemplate.getForObject("http://post-service/post/1", Post.class);
        Notification notification = restTemplate.getForObject("http://NOTIFICATION-SERVICE/notification/1", Notification.class);
        return new User(userId, "User Name "+userId,"xxxx"+userId, post, notification);

    }
    public User userServiceFallBack(Exception userException){
        return new User("1","User One","XXYZ",null,null);
    }
}
