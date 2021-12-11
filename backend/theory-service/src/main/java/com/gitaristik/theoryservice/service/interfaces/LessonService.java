package com.gitaristik.theoryservice.service.interfaces;

import com.gitaristik.theoryservice.controller.dto.LessonDTO;

import java.util.List;

public interface LessonService {

    List<LessonDTO> getAllLessons();
    LessonDTO getLessonById(Long id);

}
