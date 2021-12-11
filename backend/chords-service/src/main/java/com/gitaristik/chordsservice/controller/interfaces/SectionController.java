package com.gitaristik.chordsservice.controller.interfaces;

import com.gitaristik.chordsservice.model.Section;

import java.util.List;

public interface SectionController {

    List<Section> getAllSections();
    Section getSectionById(Long id);

}
