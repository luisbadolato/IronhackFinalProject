package com.gitaristik.edgeauthservice.controller.impl;

import com.gitaristik.edgeauthservice.controller.interfaces.TheoryController;
import com.gitaristik.edgeauthservice.dto.LessonDTO;
import com.gitaristik.edgeauthservice.model.Subject;
import com.gitaristik.edgeauthservice.service.interfaces.TheoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theory")
@CrossOrigin
public class TheoryControllerImpl implements TheoryController {

    @Autowired
    private TheoryService theoryService;

    @GetMapping("/lessons")
    @ResponseStatus(HttpStatus.OK)
    public List<LessonDTO> getAllLessons() {
        return theoryService.getAllLessons();
    }

    @GetMapping("/lessons/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LessonDTO getLessonById(@PathVariable Long id) {
        return theoryService.getLessonById(id);
    }

    @GetMapping("/subjects")
    @ResponseStatus(HttpStatus.OK)
    public List<Subject> getAllSubjects() {
        return theoryService.getAllSubjects();
    }

    @GetMapping("/subjects/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Subject getSubjectById(@PathVariable Long id) {
        return theoryService.getSubjectById(id);
    }
}
