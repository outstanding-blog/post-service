package com.amoylabs.blog.post.service;

import com.amoylabs.blog.post.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

@Service
public class PostsService {

    public List<Post> loadPosts() {
        return Arrays.asList(
                mockPost("Title 1", "Content 1"),
                mockPost("Title 2", "Content 2"),
                mockPost("Title 3", "Content 3")
        );
    }

    private Post mockPost(String title, String content) {
        Post post = new Post();
        post.setPostId(UUID.randomUUID());
        post.setUserId(UUID.fromString("c7b2eb87-f5c5-4558-a568-adba5f647690"));
        post.setTitle(title);
        post.setContent(content);
        post.setCreatedDate(Calendar.getInstance().getTime());
        return post;
    }
}
