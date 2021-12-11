package com.gitaristik.scalesservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="`lesson`")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lessonTitle;
    private String textBody;
    private String imageUrl;
    private String adviceText;
    private String audioSlowUrl;
    private String audioFastUrl;

    @ManyToOne
    @JoinColumn(name="unit_id")
    @JsonIgnore
    private Unit unit;

    public Lesson() {
    }

    public Lesson(String lessonTitle, String textBody, String imageUrl, String adviceText, String audioSlowUrl, String audioFastUrl) {
        this.lessonTitle = lessonTitle;
        this.textBody = textBody;
        this.imageUrl = imageUrl;
        this.adviceText = adviceText;
        this.audioSlowUrl = audioSlowUrl;
        this.audioFastUrl = audioFastUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLessonTitle() {
        return lessonTitle;
    }

    public void setLessonTitle(String lessonTitle) {
        this.lessonTitle = lessonTitle;
    }

    public String getTextBody() {
        return textBody;
    }

    public void setTextBody(String textBody) {
        this.textBody = textBody;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAdviceText() {
        return adviceText;
    }

    public void setAdviceText(String adviceText) {
        this.adviceText = adviceText;
    }

    public String getAudioSlowUrl() {
        return audioSlowUrl;
    }

    public void setAudioSlowUrl(String audioSlowUrl) {
        this.audioSlowUrl = audioSlowUrl;
    }

    public String getAudioFastUrl() {
        return audioFastUrl;
    }

    public void setAudioFastUrl(String audioFastUrl) {
        this.audioFastUrl = audioFastUrl;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}