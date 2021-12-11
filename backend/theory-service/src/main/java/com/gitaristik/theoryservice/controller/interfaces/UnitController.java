package com.gitaristik.theoryservice.controller.interfaces;

import com.gitaristik.theoryservice.model.Unit;

import java.util.List;

public interface UnitController {

    List<Unit> getAllUnits();
    Unit getUnitById(Long id);
}
