package com.gitaristik.arpegioservice.service.interfaces;

import com.gitaristik.arpegioservice.model.Section;

import java.util.List;

public interface SectionService {

    List<Section> getAllSections();
    Section getSectionById(Long id);
}
