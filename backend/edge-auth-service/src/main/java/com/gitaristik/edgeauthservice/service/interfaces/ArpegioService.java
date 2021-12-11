package com.gitaristik.edgeauthservice.service.interfaces;

import com.gitaristik.edgeauthservice.dto.LessonDTO;
import com.gitaristik.edgeauthservice.model.Subject;

import java.util.List;

public interface ArpegioService {

    List<LessonDTO> getAllLessons();
    LessonDTO getLessonById(Long id);
    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}
