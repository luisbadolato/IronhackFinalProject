package com.gitaristik.scalesservice.service.interfaces;

import com.gitaristik.scalesservice.controller.dto.LessonDTO;

import java.util.List;

public interface LessonService {

    List<LessonDTO> getAllLessons();
    LessonDTO getLessonById(Long id);

}
