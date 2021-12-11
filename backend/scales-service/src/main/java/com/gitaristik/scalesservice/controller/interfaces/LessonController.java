package com.gitaristik.scalesservice.controller.interfaces;

import com.gitaristik.scalesservice.controller.dto.LessonDTO;

import java.util.List;

public interface LessonController {

    List<LessonDTO> getAllLessons();
    LessonDTO getLessonById(Long id);
}
