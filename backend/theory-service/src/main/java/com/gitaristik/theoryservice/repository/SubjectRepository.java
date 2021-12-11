package com.gitaristik.theoryservice.repository;

import com.gitaristik.theoryservice.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {


}
