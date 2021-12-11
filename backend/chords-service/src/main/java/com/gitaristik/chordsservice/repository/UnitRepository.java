package com.gitaristik.chordsservice.repository;

import com.gitaristik.chordsservice.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {


}
