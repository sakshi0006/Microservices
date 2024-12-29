package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PostServiceApplication {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        SpringApplication.run(PostServiceApplication.class,args);
    }
}