package com.gitaristik.arpegioservice.controller.impl;

import com.gitaristik.arpegioservice.controller.interfaces.SectionController;
import com.gitaristik.arpegioservice.model.Section;
import com.gitaristik.arpegioservice.service.interfaces.SectionService;
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
