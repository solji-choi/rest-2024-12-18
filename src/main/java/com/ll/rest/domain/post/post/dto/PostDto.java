package com.ll.rest.domain.post.post.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ll.rest.domain.post.post.entity.Post;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostDto {
    private long id;
    @JsonProperty("creagedDateTime")
    private LocalDateTime createdAt;
    @JsonProperty("modifiedDateTime")
    private LocalDateTime modifiedAt;
    private String title;
    private String content;

    public PostDto(Post post) {
        this.id = post.getId();
        this.createdAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
        this.title = post.getTitle();
        this.content = post.getContent();
    }
}
