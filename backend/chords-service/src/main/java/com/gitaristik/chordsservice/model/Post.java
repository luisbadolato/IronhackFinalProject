package com.gitaristik.chordsservice.model;

import javax.persistence.*;

@Entity
@Table(name="`post`")
public class Post {

    @Id
    private Long id;
    private String postTitle;
    private String postBody;
    @OneToOne
    @JoinColumn(name="unit_id")
    private Unit unit;

    public Post() {
    }

    public Post(String postTitle, String postBody) {
        this.postTitle = postTitle;
        this.postBody = postBody;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
