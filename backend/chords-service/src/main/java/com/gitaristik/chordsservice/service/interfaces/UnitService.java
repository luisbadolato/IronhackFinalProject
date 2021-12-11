package com.gitaristik.chordsservice.service.interfaces;

import com.gitaristik.chordsservice.model.Unit;

import java.util.List;

public interface UnitService {

    List<Unit> getAllUnits();
    Unit getUnitById(Long id);
}
