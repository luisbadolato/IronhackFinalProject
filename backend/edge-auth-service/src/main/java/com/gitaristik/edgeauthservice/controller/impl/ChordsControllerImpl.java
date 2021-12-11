package com.gitaristik.edgeauthservice.controller.impl;

import com.gitaristik.edgeauthservice.controller.interfaces.ChordsController;
import com.gitaristik.edgeauthservice.dto.LessonDTO;
import com.gitaristik.edgeauthservice.model.Subject;
import com.gitaristik.edgeauthservice.service.interfaces.ChordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chords")
@CrossOrigin
public class ChordsControllerImpl implements ChordsController {

    @Autowired
    private ChordsService chordsService;

    @GetMapping("/lessons")
    @ResponseStatus(HttpStatus.OK)
    public List<LessonDTO> getAllLessons() {
        return chordsService.getAllLessons();
    }

    @GetMapping("/lessons/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LessonDTO getLessonById(@PathVariable Long id) {
        return chordsService.getLessonById(id);
    }

    @GetMapping("/subjects")
    @ResponseStatus(HttpStatus.OK)
    public List<Subject> getAllSubjects() {
        return chordsService.getAllSubjects();
    }

    @GetMapping("/subjects/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Subject getSubjectById(@PathVariable Long id) {
        return chordsService.getSubjectById(id);
    }
}
