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
        post.setUuid(UUID.randomUUID());
        post.setUserUuid(UUID.randomUUID());
        post.setTitle(title);
        post.setContent(content);
        post.setCreatedDate(Calendar.getInstance().getTime());
        return post;
    }
}
