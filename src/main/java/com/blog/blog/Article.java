package com.blog.blog;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Article {
    @NotBlank(message = "Title is required")
    @Size(max = 255, message = "Title cannot be longer than 255 symbols")
    private String title;

    @NotBlank(message = "Subtitle is required")
    @Size(max = 255, message = "Subtitle cannot be longer than 255 symbols")
    private String subtitle;

    @NotBlank(message = "Content is required")
    private String content;

    public Article(String title, String subtitle, String content) {
        this.title = title;
        this.subtitle = subtitle;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getContent() {
        return content;
    }
}
