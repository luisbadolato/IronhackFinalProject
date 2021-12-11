package com.gitaristik.theoryservice.service.interfaces;

import com.gitaristik.theoryservice.model.Section;

import java.util.List;

public interface SectionService {

    List<Section> getAllSections();
    Section getSectionById(Long id);
}
