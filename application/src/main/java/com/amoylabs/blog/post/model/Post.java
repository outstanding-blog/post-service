package com.amoylabs.blog.post.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Setter
@Getter
public class Post {
    private UUID postId;
    private UUID userId;
    private String title;
    private String content;
    private Date createdDate;
}
