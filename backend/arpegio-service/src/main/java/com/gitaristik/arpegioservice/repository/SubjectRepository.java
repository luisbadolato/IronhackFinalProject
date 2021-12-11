package com.gitaristik.arpegioservice.repository;

import com.gitaristik.arpegioservice.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {


}
