package com.gitaristik.arpegioservice.repository;

import com.gitaristik.arpegioservice.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {

}
