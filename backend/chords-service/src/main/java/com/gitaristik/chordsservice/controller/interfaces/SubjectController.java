package com.gitaristik.chordsservice.controller.interfaces;

import com.gitaristik.chordsservice.model.Subject;

import java.util.List;

public interface SubjectController {

    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}
