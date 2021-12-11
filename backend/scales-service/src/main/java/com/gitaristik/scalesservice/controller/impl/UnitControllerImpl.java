package com.gitaristik.scalesservice.controller.impl;

import com.gitaristik.scalesservice.controller.interfaces.UnitController;
import com.gitaristik.scalesservice.model.Unit;
import com.gitaristik.scalesservice.repository.UnitRepository;
import com.gitaristik.scalesservice.service.interfaces.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@CrossOrigin
public class UnitControllerImpl implements UnitController {

    @Autowired
    private UnitService unitService;

    @GetMapping("/units")
    @ResponseStatus(HttpStatus.OK)
    public List<Unit> getAllUnits() {
        return unitService.getAllUnits();
    }

    @GetMapping("/units/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Unit getUnitById(@PathVariable Long id) {
        return unitService.getUnitById(id);
    }
}
