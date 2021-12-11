package com.gitaristik.theoryservice.repository;

import com.gitaristik.theoryservice.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {


}
