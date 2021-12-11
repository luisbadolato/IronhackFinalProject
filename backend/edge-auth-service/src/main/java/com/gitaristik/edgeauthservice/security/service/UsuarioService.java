package com.gitaristik.edgeauthservice.security.service;

import com.gitaristik.edgeauthservice.security.entity.Usuario;
import com.gitaristik.edgeauthservice.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existsByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmaik(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}
