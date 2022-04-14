package com.amoylabs.blog.post.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Setter
@Getter
public class Post {
    private UUID uuid;
    private UUID userUuid;
    private String title;
    private String content;
    private Date createdDate;
}
