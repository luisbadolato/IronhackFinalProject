package com.gitaristik.arpegioservice.service.interfaces;

import com.gitaristik.arpegioservice.controller.dto.LessonDTO;

import java.util.List;

public interface LessonService {

    List<LessonDTO> getAllLessons();
    LessonDTO getLessonById(Long id);

}
