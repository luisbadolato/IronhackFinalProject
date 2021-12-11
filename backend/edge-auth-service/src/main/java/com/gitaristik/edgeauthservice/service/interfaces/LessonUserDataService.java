package com.gitaristik.edgeauthservice.service.interfaces;

import com.gitaristik.edgeauthservice.dto.LessonUserDataDTO;
import com.gitaristik.edgeauthservice.model.LessonUserData;

import java.util.List;

public interface LessonUserDataService {

    List<LessonUserData> findAllByUsuarioId(int usuarioId);
    List<LessonUserData> findAllByModuleName(String moduleName);
    List<LessonUserData> findAllByUsuarioIdAndModuleName(int usuarioId, String moduleName);
    List<LessonUserData> findAllByUsuarioNombreUsuarioAndModuleName(String nombreUsuario, String moduleName);
    LessonUserData findByUsuarioIdAndLessonIdAndModuleName(int usuarioId, long lessonId, String moduleName);
    LessonUserData findByNombreUsuarioAndLessonIdAndModuleName(String nombreUsuario, long lessonId, String moduleName);
    void store(LessonUserDataDTO lessonUserDataDTO);
    void update(Long id, LessonUserDataDTO lessonUserDataDTO);
    void delete(Long id);
}
