package org._24.articles.dto;

import org._24.articles.entity.Article;
import java.time.LocalDateTime;

public class ArticleResponse {
    private Long id;
    private String title;
    private String description;
    private String content;
    private String category;
    private String author;
    private Integer views;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Constructor that converts Article to ArticleResponse
    public ArticleResponse(Article article) {
        this.id = article.getId();
        this.title = article.getTitle();
        this.description = article.getDescription();
        this.content = article.getContent();
        this.category = article.getCategory();
        this.author = article.getAuthor();
        this.views = article.getViews();
        this.createdAt = article.getCreatedAt();
        this.updatedAt = article.getUpdatedAt();
    }

    // Getters & Setters

    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getTitle(){ return title; }
    public void  setTitle(String title){ this.title = title; }

    public String getDescription(){ return description; }
    public void  setDescription(String description){ this.description = description; }

    public String getContent(){ return content; }
    public void  setContent(String content){ this.content = content; }

    public String getCategory(){ return category; }
    public void  setCategory(String category){ this.category = category; }

    public String getAuthor(){ return author; }
    public void  setAuthor(String author){ this.author = author; }

    public Integer getViews(){ return views; }
    public void  setViews(Integer views){ this.views = views; }

    public LocalDateTime getCreatedAt(){ return createdAt; }
    public void  setCreatedAt(LocalDateTime createdAt){ this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt(){ return updatedAt; }
    public void  setUpdatedAt(LocalDateTime updatedAt){ this.updatedAt = updatedAt; }



}
