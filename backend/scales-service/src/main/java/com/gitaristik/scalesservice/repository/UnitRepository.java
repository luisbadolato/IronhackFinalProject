package com.gitaristik.scalesservice.repository;

import com.gitaristik.scalesservice.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {


}
