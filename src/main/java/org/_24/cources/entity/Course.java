package org._24.cources.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private String videoUrl;  // YouTube link

    private String websiteUrl;  // External course link

    @Column(nullable = false)
    private String category;  // "Java", "SQL", "Spring", etc.

    @Column(nullable = false)
    private String level;  // "beginner", "intermediate", "advanced"

    @Column(nullable = false)
    private Integer duration;  // in hours

    @Column(nullable = false)
    private String instructor;

    @Column(nullable = false)
    private Integer views;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    // Constructor
    public Course(String title, String description, String videoUrl, String websiteUrl,
                  String category, String level, Integer duration, String instructor) {
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
        this.websiteUrl = websiteUrl;
        this.category = category;
        this.level = level;
        this.duration = duration;
        this.instructor = instructor;
        this.views = 0;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    // Empty constructor
    public Course() {}

    // Getters & Setters for all fields
    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }

    public String getTitle(){ return title; }
    public void  setTitle(String title){ this.title = title; }

    public String getDescription(){ return description; }
    public void  setDescription(String description){ this.description = description; }

    public String getVideoUrl(){ return videoUrl; }
    public void  setVideoUrl(String videoUrl){ this.videoUrl = videoUrl; }

    public String getWebsiteUrl(){ return websiteUrl; }
    public void  setWebsiteUrl(String websiteUrl){ this.websiteUrl = websiteUrl; }

    public String getCategory(){ return category; }
    public void  setCategory(String category){ this.category = category; }

    public String getLevel(){ return level; }
    public void  setLevel(String level){ this.level = level; }

    public Integer getDuration(){ return duration; }
    public void  setDuration(Integer duration){ this.duration = duration; }

    public String getInstructor(){ return instructor; }
    public void  setInstructor(String instructor){ this.instructor = instructor; }

    public Integer getViews(){ return views; }
    public void  setViews(Integer views){ this.views = views; }

    public LocalDateTime getCreatedAt(){ return createdAt; }
    public void  setCreatedAt(LocalDateTime createdAt){ this.createdAt = createdAt; }

    public LocalDateTime getUpdatedAt(){ return updatedAt; }
    public void  setUpdatedAt(LocalDateTime updatedAt){ this.updatedAt = updatedAt; }}
