package com.gitaristik.theoryservice.service.interfaces;

import com.gitaristik.theoryservice.model.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}
