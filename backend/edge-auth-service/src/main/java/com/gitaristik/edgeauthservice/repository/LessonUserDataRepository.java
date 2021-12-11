package com.gitaristik.edgeauthservice.repository;

import com.gitaristik.edgeauthservice.enums.ModuleName;
import com.gitaristik.edgeauthservice.model.LessonUserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LessonUserDataRepository extends JpaRepository<LessonUserData, Long> {

    List<LessonUserData> findAllByUsuarioId(int usuarioId);
    List<LessonUserData> findAllByModuleName(ModuleName moduleName);
    List<LessonUserData> findAllByUsuarioIdAndModuleName(int usuarioId, ModuleName moduleName);
    List<LessonUserData> findAllByUsuarioNombreUsuarioAndModuleName(String nombreUsuario, ModuleName moduleName);
    Optional<LessonUserData> findByUsuarioIdAndLessonIdAndModuleName(int usuarioId,long lessonId, ModuleName moduleName);
    Optional<LessonUserData> findByUsuarioNombreUsuarioAndLessonIdAndModuleName(String nombreUsuario, long lessonId, ModuleName moduleName);
}
