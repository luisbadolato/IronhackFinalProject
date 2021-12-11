package com.gitaristik.scalesservice.service.interfaces;

import com.gitaristik.scalesservice.model.Unit;

import java.util.List;

public interface UnitService {

    List<Unit> getAllUnits();
    Unit getUnitById(Long id);
}
