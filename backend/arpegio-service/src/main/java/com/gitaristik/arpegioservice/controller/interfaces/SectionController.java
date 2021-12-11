package com.gitaristik.arpegioservice.controller.interfaces;

import com.gitaristik.arpegioservice.model.Section;

import java.util.List;

public interface SectionController {

    List<Section> getAllSections();
    Section getSectionById(Long id);

}
