package com.gitaristik.edgeauthservice.controller.interfaces;

import com.gitaristik.edgeauthservice.dto.LessonDTO;
import com.gitaristik.edgeauthservice.model.Subject;

import java.util.List;

public interface ChordsController {

    List<LessonDTO> getAllLessons();
    LessonDTO getLessonById(Long id);
    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}
