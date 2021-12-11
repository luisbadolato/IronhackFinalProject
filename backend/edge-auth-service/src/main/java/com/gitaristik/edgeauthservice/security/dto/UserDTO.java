package com.gitaristik.edgeauthservice.security.dto;

import com.gitaristik.edgeauthservice.model.LessonUserData;

import java.util.List;

public class UserDTO {

    private int id;
    private String nombre;
    private String nombreUsuario;
    private String email;
    private String password;
    private List<LessonUserData> lessonUserDataList;

    public UserDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<LessonUserData> getLessonUserDataList() {
        return lessonUserDataList;
    }

    public void setLessonUserDataList(List<LessonUserData> lessonUserDataList) {
        this.lessonUserDataList = lessonUserDataList;
    }
}
