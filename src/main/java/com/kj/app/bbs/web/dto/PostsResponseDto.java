package com.kj.app.bbs.web.dto;

import com.kj.app.bbs.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts posts) {
        this.id = posts.getId();
        this.title = posts.getTitle();
        this.content = posts.getContent();
        this.author = posts.getAuthor();
    }
}
