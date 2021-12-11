package com.gitaristik.theoryservice.service.impl;

import com.gitaristik.theoryservice.model.Unit;
import com.gitaristik.theoryservice.repository.UnitRepository;
import com.gitaristik.theoryservice.service.interfaces.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class UnitServiceImpl implements UnitService {

    @Autowired
    private UnitRepository unitRepository;

    @Override
    public List<Unit> getAllUnits() {
        return unitRepository.findAll();
    }

    @Override
    public Unit getUnitById(Long id) {
        return unitRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Unit not found"));
    }
}
