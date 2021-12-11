package com.gitaristik.scalesservice.service.impl;

import com.gitaristik.scalesservice.controller.dto.LessonDTO;
import com.gitaristik.scalesservice.model.Lesson;
import com.gitaristik.scalesservice.repository.LessonRepository;
import com.gitaristik.scalesservice.service.interfaces.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    @Override
    public List<LessonDTO> getAllLessons() {
        List<Lesson> lessons = lessonRepository.findAll();
        List<LessonDTO> lessonDTOS = new ArrayList<>();
        for (Lesson lesson : lessons) {
            LessonDTO lessonDTO = new LessonDTO();
            lessonDTO.setId(lesson.getId());
            lessonDTO.setLessonTitle(lesson.getLessonTitle());
            lessonDTO.setTextBody(lesson.getTextBody());
            lessonDTO.setImageUrl(lesson.getImageUrl());
            lessonDTO.setAdviceText(lesson.getAdviceText());
            lessonDTO.setAudioSlowUrl(lesson.getAudioSlowUrl());
            lessonDTO.setAudioFastUrl(lesson.getAudioFastUrl());
            lessonDTO.setUnit(lesson.getUnit().getId());
            lessonDTOS.add(lessonDTO);
        }
        return lessonDTOS;
    }

    @Override
    public LessonDTO getLessonById(Long id) {
        Lesson lesson = lessonRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Lesson not found"));
        LessonDTO lessonDTO = new LessonDTO();
        lessonDTO.setId(lesson.getId());
        lessonDTO.setLessonTitle(lesson.getLessonTitle());
        lessonDTO.setTextBody(lesson.getTextBody());
        lessonDTO.setImageUrl(lesson.getImageUrl());
        lessonDTO.setAdviceText(lesson.getAdviceText());
        lessonDTO.setAudioSlowUrl(lesson.getAudioSlowUrl());
        lessonDTO.setAudioFastUrl(lesson.getAudioFastUrl());
        lessonDTO.setUnit(lesson.getUnit().getId());
        return lessonDTO;
    }
}














/*

    private Long unit;

 */