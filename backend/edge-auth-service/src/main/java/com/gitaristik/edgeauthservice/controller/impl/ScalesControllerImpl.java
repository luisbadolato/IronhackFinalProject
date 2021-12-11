package com.gitaristik.edgeauthservice.controller.impl;

import com.gitaristik.edgeauthservice.client.ScalesServiceClient;
import com.gitaristik.edgeauthservice.controller.interfaces.ScalesController;
import com.gitaristik.edgeauthservice.dto.LessonDTO;
import com.gitaristik.edgeauthservice.model.Subject;
import com.gitaristik.edgeauthservice.service.interfaces.ScalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scales")
@CrossOrigin
public class ScalesControllerImpl implements ScalesController {

    @Autowired
    private ScalesService scalesService;

    @GetMapping("/lessons")
    @ResponseStatus(HttpStatus.OK)
    public List<LessonDTO> getAllLessons() {
        return scalesService.getAllLessons();
    }

    @GetMapping("/lessons/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LessonDTO getLessonById(@PathVariable Long id) {
        return scalesService.getLessonById(id);
    }

    @GetMapping("/subjects")
    @ResponseStatus(HttpStatus.OK)
    public List<Subject> getAllSubjects() {
        return scalesService.getAllSubjects();
    }

    @GetMapping("/subjects/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Subject getSubjectById(@PathVariable Long id) {
        return scalesService.getSubjectById(id);
    }
}
