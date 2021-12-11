package com.gitaristik.theoryservice.repository;

import com.gitaristik.theoryservice.model.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
