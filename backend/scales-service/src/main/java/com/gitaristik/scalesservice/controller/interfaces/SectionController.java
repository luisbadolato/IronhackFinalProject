package com.gitaristik.scalesservice.controller.interfaces;

import com.gitaristik.scalesservice.model.Section;

import java.util.List;

public interface SectionController {

    List<Section> getAllSections();
    Section getSectionById(Long id);

}
