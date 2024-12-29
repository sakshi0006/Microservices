package com.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfileServiceApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(ProfileServiceApplication.class,args);
    }
}