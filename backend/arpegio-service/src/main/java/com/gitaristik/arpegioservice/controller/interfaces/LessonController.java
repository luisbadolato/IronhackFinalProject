package com.gitaristik.arpegioservice.controller.interfaces;

import com.gitaristik.arpegioservice.controller.dto.LessonDTO;

import java.util.List;

public interface LessonController {

    List<LessonDTO> getAllLessons();
    LessonDTO getLessonById(Long id);
}
