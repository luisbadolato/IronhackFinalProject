package com.gitaristik.edgeauthservice.service.impl;

import com.gitaristik.edgeauthservice.dto.LessonUserDataDTO;
import com.gitaristik.edgeauthservice.enums.ModuleName;
import com.gitaristik.edgeauthservice.model.LessonUserData;
import com.gitaristik.edgeauthservice.repository.LessonUserDataRepository;
import com.gitaristik.edgeauthservice.security.entity.Usuario;
import com.gitaristik.edgeauthservice.security.repository.UsuarioRepository;
import com.gitaristik.edgeauthservice.service.interfaces.LessonUserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LessonUserDataServiceImpl implements LessonUserDataService {

    @Autowired
    private LessonUserDataRepository lessonUserDataRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<LessonUserData> findAllByUsuarioId(int usuarioId) {
        return lessonUserDataRepository.findAllByUsuarioId(usuarioId);
    }

    @Override
    public List<LessonUserData> findAllByModuleName(String moduleName) {
        return lessonUserDataRepository.findAllByModuleName(ModuleName.valueOf(moduleName));
    }

    @Override
    public List<LessonUserData> findAllByUsuarioIdAndModuleName(int usuarioId, String moduleName) {
        return lessonUserDataRepository.findAllByUsuarioIdAndModuleName(usuarioId, ModuleName.valueOf(moduleName));
    }

    @Override
    public List<LessonUserData> findAllByUsuarioNombreUsuarioAndModuleName(String nombreUsuario, String moduleName) {
        Usuario usuario = usuarioRepository.findByNombreUsuario(nombreUsuario).orElseThrow(
                ()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        List<LessonUserData> dataList = lessonUserDataRepository.findAllByUsuarioNombreUsuarioAndModuleName(nombreUsuario, ModuleName.valueOf(moduleName));
        List<LessonUserData> filteredList = new ArrayList<>();
        if (dataList.size() > 0) {
            for (LessonUserData item: dataList) {
                if (item.getMastery() > 0) {
                    filteredList.add(item);
                }
            }
        }
        return filteredList;
    }

    @Override
    public LessonUserData findByUsuarioIdAndLessonIdAndModuleName(int usuarioId, long lessonId, String moduleName) {
        LessonUserData data = lessonUserDataRepository.findByUsuarioIdAndLessonIdAndModuleName(
                        usuarioId, lessonId, ModuleName.valueOf(moduleName))
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Data not found"));
        return data;
    }

    @Override
    public LessonUserData findByNombreUsuarioAndLessonIdAndModuleName(String nombreUsuario, long lessonId, String moduleName) {
        Usuario usuario = usuarioRepository.findByNombreUsuario(nombreUsuario).orElseThrow(
                ()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        Optional<LessonUserData> optionalData = lessonUserDataRepository.findByUsuarioNombreUsuarioAndLessonIdAndModuleName(nombreUsuario, lessonId, ModuleName.valueOf(moduleName));
        if (optionalData.isPresent()) {
            LessonUserData data = optionalData.get();
            return data;
        } else {
            LessonUserData data = new LessonUserData("", 0, lessonId, ModuleName.valueOf(moduleName));
            data.setUsuario(usuario);
            lessonUserDataRepository.save(data);
            return data;
        }
    }

    @Override
    public void store(LessonUserDataDTO dataDTO) {
        Usuario usuario = usuarioRepository.findById(dataDTO.getUsuarioId()).orElseThrow(
                ()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        if (lessonUserDataRepository.findByUsuarioIdAndLessonIdAndModuleName(
                usuario.getId(), dataDTO.getLessonId(), dataDTO.getModuleName()).isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Data already in database");
        }
        try {
            LessonUserData data = new LessonUserData();
            data.setAnnotation(dataDTO.getAnnotation());
            data.setMastery(dataDTO.getMastery());
            data.setLessonId(dataDTO.getLessonId());
            data.setUsuario(usuario);
            data.setModuleName(dataDTO.getModuleName());
            lessonUserDataRepository.save(data);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public void update(Long id, LessonUserDataDTO dataDTO) {
        Usuario usuario = usuarioRepository.findById(dataDTO.getUsuarioId()).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        try {
            LessonUserData data = lessonUserDataRepository.findByUsuarioIdAndLessonIdAndModuleName(
                    usuario.getId(), dataDTO.getLessonId(), dataDTO.getModuleName()).get();
            data.setAnnotation(dataDTO.getAnnotation());
            data.setMastery(dataDTO.getMastery());
            lessonUserDataRepository.save(data);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public void delete(Long id) {
        lessonUserDataRepository.deleteById(id);
    }
}
