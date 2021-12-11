package com.gitaristik.theoryservice.controller.interfaces;

import com.gitaristik.theoryservice.model.Subject;

import java.util.List;

public interface SubjectController {

    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}
