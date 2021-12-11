package com.gitaristik.theoryservice.controller.impl;

import com.gitaristik.theoryservice.controller.interfaces.SectionController;
import com.gitaristik.theoryservice.model.Section;
import com.gitaristik.theoryservice.service.interfaces.SectionService;
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
