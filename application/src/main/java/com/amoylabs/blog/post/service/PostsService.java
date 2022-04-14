package com.amoylabs.blog.post.service;

import com.amoylabs.blog.post.model.Post;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

@Service
public class PostsService {

    public Post loadPost(UUID postId) {
        return mockPost(postId, "Title x", "Content x");
    }

    public List<Post> loadPosts() {
        return Arrays.asList(
                mockPost(UUID.randomUUID(), "Title 1", "Content 1"),
                mockPost(UUID.randomUUID(), "Title 2", "Content 2"),
                mockPost(UUID.randomUUID(), "Title 3", "Content 3")
        );
    }

    private Post mockPost(UUID postId, String title, String content) {
        Post post = new Post();
        post.setPostId(postId);
        post.setUserId(UUID.fromString("c7b2eb87-f5c5-4558-a568-adba5f647690"));
        post.setTitle(title);
        post.setContent(content);
        post.setCreatedDate(Calendar.getInstance().getTime());
        return post;
    }
}
