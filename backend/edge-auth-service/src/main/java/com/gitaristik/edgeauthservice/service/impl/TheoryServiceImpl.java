package com.gitaristik.edgeauthservice.service.impl;

import com.gitaristik.edgeauthservice.client.TheoryServiceClient;
import com.gitaristik.edgeauthservice.dto.LessonDTO;
import com.gitaristik.edgeauthservice.model.Subject;
import com.gitaristik.edgeauthservice.service.interfaces.TheoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TheoryServiceImpl implements TheoryService {

    @Autowired
    private TheoryServiceClient theoryServiceClient;

    @Override
    public List<LessonDTO> getAllLessons() {
        try {
            return theoryServiceClient.getAllLessons();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error loading lesson list");
        }
    }

    @Override
    public LessonDTO getLessonById(Long id) {
        try {
            return theoryServiceClient.getLessonById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error loading lesson");
        }
    }

    @Override
    public List<Subject> getAllSubjects() {
        try {
            return theoryServiceClient.getAllSubjects();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error loading subject list");
        }
    }

    @Override
    public Subject getSubjectById(Long id) {
        try {
            return theoryServiceClient.getSubjectById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error loading subject");
        }
    }
}
