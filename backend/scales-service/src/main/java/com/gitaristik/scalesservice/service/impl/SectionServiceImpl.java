package com.gitaristik.scalesservice.service.impl;

import com.gitaristik.scalesservice.model.Section;
import com.gitaristik.scalesservice.repository.SectionRepository;
import com.gitaristik.scalesservice.service.interfaces.SectionService;
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
