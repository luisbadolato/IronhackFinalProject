package com.gitaristik.chordsservice.service.interfaces;

import com.gitaristik.chordsservice.model.Section;

import java.util.List;

public interface SectionService {

    List<Section> getAllSections();
    Section getSectionById(Long id);
}
