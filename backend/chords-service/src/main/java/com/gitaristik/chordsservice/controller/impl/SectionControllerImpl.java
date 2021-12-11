package com.gitaristik.chordsservice.controller.impl;

import com.gitaristik.chordsservice.controller.interfaces.SectionController;
import com.gitaristik.chordsservice.model.Section;
import com.gitaristik.chordsservice.service.interfaces.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SectionControllerImpl implements SectionController {

    @Autowired
    private SectionService sectionService;

    @GetMapping("/sections")
    @ResponseStatus(HttpStatus.OK)
    public List<Section> getAllSections() {
        return sectionService.getAllSections();
    }

    @GetMapping("/sections/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Section getSectionById(@PathVariable Long id) {
        return sectionService.getSectionById(id);
    }
}
