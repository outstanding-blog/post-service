package com.amoylabs.blog.post.controller;

import com.amoylabs.blog.post.service.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/v1/posts")
public class PostsController {

    PostsService postsService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity loadPosts() {
        return ResponseEntity.ok().body(postsService.loadPosts());
    }

    @GetMapping(value = "/{postId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity loadPost(@PathVariable UUID postId) {
        return ResponseEntity.ok().body(postsService.loadPost(postId));
    }

    @Autowired
    public void setPostsService(PostsService postsService) {
        this.postsService = postsService;
    }
}