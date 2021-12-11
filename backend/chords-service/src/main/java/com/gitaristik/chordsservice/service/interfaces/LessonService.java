package com.gitaristik.chordsservice.service.interfaces;

import com.gitaristik.chordsservice.controller.dto.LessonDTO;

import java.util.List;

public interface LessonService {

    List<LessonDTO> getAllLessons();
    LessonDTO getLessonById(Long id);

}
