package com.gitaristik.theoryservice.repository;

import com.gitaristik.theoryservice.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {

}
