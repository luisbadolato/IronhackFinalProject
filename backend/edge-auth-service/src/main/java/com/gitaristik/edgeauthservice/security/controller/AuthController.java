package com.gitaristik.edgeauthservice.security.controller;

import com.gitaristik.edgeauthservice.dto.Mensaje;
import com.gitaristik.edgeauthservice.security.dto.JwtDTO;
import com.gitaristik.edgeauthservice.security.dto.LoginUsuario;
import com.gitaristik.edgeauthservice.security.dto.NuevoUsuario;
import com.gitaristik.edgeauthservice.security.entity.Rol;
import com.gitaristik.edgeauthservice.security.entity.Usuario;
import com.gitaristik.edgeauthservice.security.enums.RolNombre;
import com.gitaristik.edgeauthservice.security.jwt.JwtProvider;
import com.gitaristik.edgeauthservice.security.service.RolService;
import com.gitaristik.edgeauthservice.security.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    RolService rolService;
    @Autowired
    JwtProvider jwtProvider;

    @PostMapping("/nuevo")
    public ResponseEntity<?> nuevo(@Valid @RequestBody NuevoUsuario nuevoUsuario, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("campos o email inválido"), HttpStatus.BAD_REQUEST);
        if(usuarioService.existsByNombreUsuario(nuevoUsuario.getNombreUsuario()))
            return new ResponseEntity(new Mensaje("el nombre de usuario ya existe"), HttpStatus.BAD_REQUEST);
        if(usuarioService.existsByEmaik(nuevoUsuario.getEmail()))
            return new ResponseEntity(new Mensaje("el email ya existe"), HttpStatus.BAD_REQUEST);
        Usuario usuario = new Usuario(
                nuevoUsuario.getNombre(),
                nuevoUsuario.getNombreUsuario(),
                nuevoUsuario.getEmail(),
                passwordEncoder.encode(nuevoUsuario.getPassword())
                );
        Set<Rol> roles = new HashSet<>();
        roles.add(rolService.getByRolNombre(RolNombre.ROLE_USER).get());
        if(nuevoUsuario.getRoles().contains("admin"))
            roles.add(rolService.getByRolNombre(RolNombre.ROLE_ADMIN).get());
        usuario.setRoles(roles);
        usuarioService.save(usuario);
        return new ResponseEntity(new Mensaje("usuario guardado"), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<JwtDTO> login(@Valid @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult) {
        if(bindingResult.hasErrors())
            return new ResponseEntity(new Mensaje("campos inválidos"), HttpStatus.BAD_REQUEST);
        Authentication authentication =
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUsuario.getNombreUsuario(), loginUsuario.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        JwtDTO jwtDto = new JwtDTO(jwt, userDetails.getUsername(), userDetails.getAuthorities());
        return new ResponseEntity(jwtDto, HttpStatus.OK);
    }
}

