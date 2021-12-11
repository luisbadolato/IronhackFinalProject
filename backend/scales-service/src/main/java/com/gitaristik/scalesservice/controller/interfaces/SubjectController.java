package com.gitaristik.scalesservice.controller.interfaces;
import com.gitaristik.scalesservice.model.Subject;

import java.util.List;

public interface SubjectController {

    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
}
