package com.gitaristik.edgeauthservice.controller.impl;

import com.gitaristik.edgeauthservice.controller.interfaces.ArpegioController;
import com.gitaristik.edgeauthservice.dto.LessonDTO;
import com.gitaristik.edgeauthservice.model.Subject;
import com.gitaristik.edgeauthservice.service.interfaces.ArpegioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/arpeggios")
@CrossOrigin
public class ArpegioControllerImpl implements ArpegioController {

    @Autowired
    private ArpegioService arpegioService;

    @GetMapping("/lessons")
    @ResponseStatus(HttpStatus.OK)
    public List<LessonDTO> getAllLessons() {
        return arpegioService.getAllLessons();
    }

    @GetMapping("/lessons/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LessonDTO getLessonById(@PathVariable Long id) {
        return arpegioService.getLessonById(id);
    }

    @GetMapping("/subjects")
    @ResponseStatus(HttpStatus.OK)
    public List<Subject> getAllSubjects() {
        return arpegioService.getAllSubjects();
    }

    @GetMapping("/subjects/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Subject getSubjectById(@PathVariable Long id) {
        return arpegioService.getSubjectById(id);
    }
}
