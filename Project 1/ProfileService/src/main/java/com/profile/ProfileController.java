package com.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @GetMapping("/{profileId}")
    public ProfileModel getProfile(@PathVariable("profileId") int profileId){
        List<String> posts = new ArrayList<>();
        posts.add("post1");
        posts.add("post2");
        List<String> notifications = new ArrayList<>();
        notifications.add("notification1");
        notifications.add("notification2");

        if(profileId == 1)
         return new ProfileModel(1, posts, notifications);
        return null;
    }
}
