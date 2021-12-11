package com.gitaristik.edgeauthservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.gitaristik.edgeauthservice.enums.ModuleName;
import com.gitaristik.edgeauthservice.security.entity.Usuario;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class LessonUserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Size(max = 255)
    private String annotation;
    @Min(0)
    @Max(4)
    private int mastery;
    @NotNull
    private Long lessonId;
    @NotNull
    @Enumerated(EnumType.STRING)
    private ModuleName moduleName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="usuario_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "lessonUserDataList", "password", "roles"})
    private Usuario usuario;

    public LessonUserData() {
    }

    public LessonUserData(String annotation, int mastery, Long lessonId, ModuleName moduleName) {
        this.annotation = annotation;
        this.mastery = mastery;
        this.lessonId = lessonId;
        this.moduleName = moduleName;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ModuleName getModuleName() {
        return moduleName;
    }

    public void setModuleName(ModuleName moduleName) {
        this.moduleName = moduleName;
    }
}
