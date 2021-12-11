package com.gitaristik.arpegioservice.repository;

import com.gitaristik.arpegioservice.model.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends JpaRepository<Unit, Long> {


}
