package com.gitaristik.chordsservice.controller.interfaces;

import com.gitaristik.chordsservice.controller.dto.LessonDTO;

import java.util.List;

public interface LessonController {

    List<LessonDTO> getAllLessons();
    LessonDTO getLessonById(Long id);
}
