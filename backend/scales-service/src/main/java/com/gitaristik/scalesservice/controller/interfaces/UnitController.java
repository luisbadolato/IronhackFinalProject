package com.gitaristik.scalesservice.controller.interfaces;

import com.gitaristik.scalesservice.model.Unit;

import java.util.List;

public interface UnitController {

    List<Unit> getAllUnits();
    Unit getUnitById(Long id);
}
