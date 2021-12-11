package com.gitaristik.arpegioservice.controller.impl;

import com.gitaristik.arpegioservice.controller.interfaces.SubjectController;
import com.gitaristik.arpegioservice.model.Subject;
import com.gitaristik.arpegioservice.service.interfaces.SubjectService;
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
