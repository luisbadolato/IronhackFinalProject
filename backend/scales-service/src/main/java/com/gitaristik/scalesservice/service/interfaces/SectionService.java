package com.gitaristik.scalesservice.service.interfaces;

import com.gitaristik.scalesservice.model.Section;

import java.util.List;

public interface SectionService {

    List<Section> getAllSections();
    Section getSectionById(Long id);
}
