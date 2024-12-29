package com.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{userId}")
    public UserModel getUser(@PathVariable("userId") int userId){
        System.out.println("hello");
        if(userId == 1) {
            RestTemplate rt = new RestTemplate();
            ProfileModel profile =
                   rt.getForObject("http://localhost:8081/profile/1", ProfileModel.class);

            return new UserModel(1, "Sakshi", "XXX", profile);
        }
        return null;
    }
}
