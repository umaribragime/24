package org._24.articles.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "LONGTEXT")
    private String content;  // Full article content

    @Column(nullable = false)
    private String category;  // "Java", "SQL", "Spring", etc.

    @Column(nullable = false)
    private String author;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer views = 0;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Constructor (sets createdAt and updatedAt to now)
    public Article(String title, String description, String content, String category, String author) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.category = category;
        this.author = author;
        this.views = 0;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    // Empty constructor
    public Article() {}

    // Getters & Setters for all fields
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