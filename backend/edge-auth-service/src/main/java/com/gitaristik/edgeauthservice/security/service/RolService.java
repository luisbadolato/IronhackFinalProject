package com.gitaristik.edgeauthservice.security.service;


import com.gitaristik.edgeauthservice.security.entity.Rol;
import com.gitaristik.edgeauthservice.security.enums.RolNombre;
import com.gitaristik.edgeauthservice.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    private RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }

    public void save(Rol rol) {
        rolRepository.save(rol);
    }

}
