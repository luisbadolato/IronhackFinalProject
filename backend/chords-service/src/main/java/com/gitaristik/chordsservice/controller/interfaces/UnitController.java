package com.gitaristik.chordsservice.controller.interfaces;

import com.gitaristik.chordsservice.model.Unit;

import java.util.List;

public interface UnitController {

    List<Unit> getAllUnits();
    Unit getUnitById(Long id);
}
