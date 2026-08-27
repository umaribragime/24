package org._24.articles.dto;

import jakarta.validation.constraints.*;
import org._24.articles.entity.Article;

public class ArticleRequest {
    @NotBlank(message = "Title cannot be blank")
    private String title;

    private String description;

    @NotBlank(message = "Content cannot be blank")
    private String content;

    @NotBlank(message = "Category cannot be blank")
    private String category;

    @NotBlank(message = "Author cannot be blank")
    private String author;

    // Constructors & Getters/Setters

    public ArticleRequest(String title, String description, String content, String category, String author){
        this.title = title;
        this.description = description;
        this.content = content;
        this.category = category;
        this.author = author;
    }
    ArticleRequest(){}

    public String getTitle() { return title;}
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description;}
    public void setDescription(String description) { this.description = description; }

    public String getContent() { return content;}
    public void setContent(String content) { this.content = content; }

    public String getCategory() { return category;}
    public void setCategory(String category) { this.category = category; }

    public String getAuthor() { return author;}
    public void setAuthor(String author) { this.author = author; }




}
