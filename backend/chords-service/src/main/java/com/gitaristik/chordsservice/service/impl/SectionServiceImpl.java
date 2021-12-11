package com.gitaristik.chordsservice.service.impl;

import com.gitaristik.chordsservice.model.Section;
import com.gitaristik.chordsservice.repository.SectionRepository;
import com.gitaristik.chordsservice.service.interfaces.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class SectionServiceImpl implements SectionService {

    @Autowired
    private SectionRepository sectionRepository;

    @Override
    public List<Section> getAllSections() {
        return sectionRepository.findAll();
    }

    @Override
    public Section getSectionById(Long id) {
        return sectionRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Section not found"));
    }
}
