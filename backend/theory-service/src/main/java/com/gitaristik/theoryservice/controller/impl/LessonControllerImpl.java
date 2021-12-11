package com.gitaristik.theoryservice.controller.impl;

import com.gitaristik.theoryservice.controller.dto.LessonDTO;
import com.gitaristik.theoryservice.controller.interfaces.LessonController;
import com.gitaristik.theoryservice.service.interfaces.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LessonControllerImpl implements LessonController {

    @Autowired
    private LessonService lessonService;

    @GetMapping("/lessons")
    @ResponseStatus(HttpStatus.OK)
    public List<LessonDTO> getAllLessons() {
        return lessonService.getAllLessons();
    }

    @GetMapping("/lessons/{id}")
    @ResponseStatus(HttpStatus.OK)
    public LessonDTO getLessonById(@PathVariable Long id) {
        return lessonService.getLessonById(id);
    }
}
