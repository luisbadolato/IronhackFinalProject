package com.gitaristik.scalesservice.controller.dto;

public class LessonDTO {

    private Long id;
    private String lessonTitle;
    private String textBody;
    private String imageUrl;
    private String adviceText;
    private String audioSlowUrl;
    private String audioFastUrl;
    private Long unit;

    public LessonDTO() {
    }

    public LessonDTO(Long id, String lessonTitle, String textBody, String imageUrl, String adviceText, String audioSlowUrl, String audioFastUrl, Long unit) {
        this.id = id;
        this.lessonTitle = lessonTitle;
        this.textBody = textBody;
        this.imageUrl = imageUrl;
        this.adviceText = adviceText;
        this.audioSlowUrl = audioSlowUrl;
        this.audioFastUrl = audioFastUrl;
        this.unit = unit;
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

    public Long getUnit() {
        return unit;
    }

    public void setUnit(Long unit) {
        this.unit = unit;
    }
}
