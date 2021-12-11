package com.gitaristik.arpegioservice.service.interfaces;

import com.gitaristik.arpegioservice.model.Unit;

import java.util.List;

public interface UnitService {

    List<Unit> getAllUnits();
    Unit getUnitById(Long id);
}
