package com.microservice.controller;

import com.microservice.model.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {

    @GetMapping(value = "/{postId}")
    public Post getPost(@PathVariable("postId") String postId){
        return new Post(postId, "Post description for "+postId);
    }
}
