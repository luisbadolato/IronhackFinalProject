package com.gitaristik.theoryservice.service.interfaces;

import com.gitaristik.theoryservice.model.Unit;

import java.util.List;

public interface UnitService {

    List<Unit> getAllUnits();
    Unit getUnitById(Long id);
}
