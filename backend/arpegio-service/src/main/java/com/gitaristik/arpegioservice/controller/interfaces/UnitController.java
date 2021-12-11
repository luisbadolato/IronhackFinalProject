package com.gitaristik.arpegioservice.controller.interfaces;

import com.gitaristik.arpegioservice.model.Unit;

import java.util.List;

public interface UnitController {

    List<Unit> getAllUnits();
    Unit getUnitById(Long id);
}
