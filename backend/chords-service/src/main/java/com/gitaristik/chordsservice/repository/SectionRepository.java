package com.gitaristik.chordsservice.repository;

import com.gitaristik.chordsservice.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {

}
