package com.gitaristik.chordsservice.service.interfaces;

import com.gitaristik.chordsservice.model.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}
