package com.gitaristik.arpegioservice.service.interfaces;

import com.gitaristik.arpegioservice.model.Subject;

import java.util.List;

public interface SubjectService {

    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}
