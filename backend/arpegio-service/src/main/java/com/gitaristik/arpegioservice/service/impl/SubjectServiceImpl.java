package com.gitaristik.arpegioservice.service.impl;

import com.gitaristik.arpegioservice.model.Subject;
import com.gitaristik.arpegioservice.repository.SubjectRepository;
import com.gitaristik.arpegioservice.service.interfaces.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getSubjectById(Long id) {
        return subjectRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Subject not found"));
    }
}
