package com.gitaristik.theoryservice.controller.interfaces;

import com.gitaristik.theoryservice.model.Section;

import java.util.List;

public interface SectionController {

    List<Section> getAllSections();
    Section getSectionById(Long id);

}
