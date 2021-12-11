package com.gitaristik.edgeauthservice.security.controller;

import com.gitaristik.edgeauthservice.security.dto.UserDTO;
import com.gitaristik.edgeauthservice.security.entity.Usuario;
import com.gitaristik.edgeauthservice.security.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> getAllUsers() {
        return usuarioRepository.findAll();
    }


    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUserById(@PathVariable int id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
    }

    @GetMapping("/name/{nombreUsuario}")
    @ResponseStatus(HttpStatus.OK)
    public UserDTO getUserByUserName(@PathVariable String nombreUsuario) {
        Usuario usuario = usuarioRepository.findByNombreUsuario(nombreUsuario).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
        UserDTO userDTO = new UserDTO();
        userDTO.setId(usuario.getId());
        userDTO.setNombre(usuario.getNombre());
        userDTO.setNombreUsuario(usuario.getNombreUsuario());
        userDTO.setEmail(usuario.getEmail());
        userDTO.setPassword(usuario.getPassword());
        userDTO.setLessonUserDataList(usuario.getLessonUserDataList());
        return userDTO;
    }

    @DeleteMapping("/name/{nombreUsuario}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Usuario deleteUserByUserName(@PathVariable String nombreUsuario) {
            Usuario usuario = usuarioRepository.findByNombreUsuario(nombreUsuario).get();
            usuarioRepository.delete(usuario);
            return usuario;
    }

}
