package com.amoylabs.blog.post.controller;

import com.amoylabs.blog.post.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/posts")
public class PostsController {

    PostsService postsService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity loadPosts() {
        return ResponseEntity.ok().body(postsService.loadPosts());
    }

    @Autowired
    public void setPostsService(PostsService postsService) {
        this.postsService = postsService;
    }
}