package com.gitaristik.theoryservice.controller.interfaces;

import com.gitaristik.theoryservice.controller.dto.LessonDTO;

import java.util.List;

public interface LessonController {

    List<LessonDTO> getAllLessons();
    LessonDTO getLessonById(Long id);
}
