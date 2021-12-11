package com.gitaristik.scalesservice.service.interfaces;

import com.gitaristik.scalesservice.model.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}
