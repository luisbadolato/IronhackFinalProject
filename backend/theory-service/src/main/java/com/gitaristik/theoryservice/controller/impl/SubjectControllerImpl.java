package com.gitaristik.theoryservice.controller.impl;

import com.gitaristik.theoryservice.controller.interfaces.SubjectController;
import com.gitaristik.theoryservice.model.Subject;
import com.gitaristik.theoryservice.service.interfaces.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SubjectControllerImpl implements SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/subjects")
    @ResponseStatus(HttpStatus.OK)
    public List<Subject> getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @GetMapping("/subjects/{id}")
    public Subject getSubjectById(@PathVariable Long id) {
        return subjectService.getSubjectById(id);
    }
}
