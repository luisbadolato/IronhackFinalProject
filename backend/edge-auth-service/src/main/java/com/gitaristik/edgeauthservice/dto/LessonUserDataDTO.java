package com.gitaristik.edgeauthservice.dto;

import com.gitaristik.edgeauthservice.enums.ModuleName;
import org.hibernate.validator.constraints.Length;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class LessonUserDataDTO {

    private Long id;
    @Length(max = 255)
    private String annotation;
    @Min(0)
    @Max(4)
    private int mastery;
    @NotNull
    private Long lessonId;
    @NotNull
    private int usuarioId;
    @NotNull
    @Enumerated(EnumType.STRING)
    private ModuleName moduleName;

    public LessonUserDataDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public int getMastery() {
        return mastery;
    }

    public void setMastery(int mastery) {
        this.mastery = mastery;
    }

    public Long getLessonId() {
        return lessonId;
    }

    public void setLessonId(Long lessonId) {
        this.lessonId = lessonId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public ModuleName getModuleName() {
        return moduleName;
    }

    public void setModuleName(ModuleName moduleName) {
        this.moduleName = moduleName;
    }
}
