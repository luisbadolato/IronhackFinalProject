package com.gitaristik.arpegioservice.controller.interfaces;

import com.gitaristik.arpegioservice.model.Subject;

import java.util.List;

public interface SubjectController {

    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}
