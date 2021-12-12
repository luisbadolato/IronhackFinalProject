package com.gitaristik.edgeauthservice.controller.impl;

import com.gitaristik.edgeauthservice.controller.interfaces.LessonUserDataController;
import com.gitaristik.edgeauthservice.dto.LessonUserDataDTO;
import com.gitaristik.edgeauthservice.model.LessonUserData;
import com.gitaristik.edgeauthservice.repository.LessonUserDataRepository;
import com.gitaristik.edgeauthservice.security.repository.UsuarioRepository;
import com.gitaristik.edgeauthservice.service.interfaces.LessonUserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/data")
@RestController
@CrossOrigin
public class LessonUserDataControllerImpl implements LessonUserDataController {

    @Autowired
    private LessonUserDataRepository lessonUserDataRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private LessonUserDataService lessonUserDataService;

    @GetMapping("/user/{id}")
    public List<LessonUserData> findAllByUsuarioId(@PathVariable int id) {
        return lessonUserDataService.findAllByUsuarioId(id);
    }

    @GetMapping("/module/{moduleName}")
    public List<LessonUserData> findAllByModuleName(@PathVariable String moduleName) {
        return lessonUserDataService.findAllByModuleName(moduleName);
    }

    @GetMapping("/user/{id}/{moduleName}")
    public List<LessonUserData> findAllByUsuarioIdAndModuleName(@PathVariable int id,@PathVariable String moduleName) {
        return lessonUserDataService.findAllByUsuarioIdAndModuleName(id, moduleName);
    }

    @GetMapping("/total/{nombreUsuario}/{moduleName}")
    @ResponseStatus(HttpStatus.OK)
    public List<LessonUserData> findAllByUsuarioNombreUsuarioAndModuleName(@PathVariable String nombreUsuario, @PathVariable String moduleName) {
        return lessonUserDataService.findAllByUsuarioNombreUsuarioAndModuleName(nombreUsuario, moduleName);
    }


    @GetMapping("/total/{usuarioId}/{moduleName}/{lessonId}")
    @ResponseStatus(HttpStatus.OK)
    public LessonUserData findByUsuarioIdAndLessonIdAndModuleName(@PathVariable int usuarioId, @PathVariable long lessonId, @PathVariable String moduleName) {
        return lessonUserDataService.findByUsuarioIdAndLessonIdAndModuleName(usuarioId, lessonId, moduleName);
    }

    @GetMapping("/{nombreUsuario}/{moduleName}/{lessonId}")
    @ResponseStatus(HttpStatus.OK)
    public LessonUserData findByNombreUsuarioAndLessonIdAndModuleName(@PathVariable String nombreUsuario, @PathVariable long lessonId, @PathVariable String moduleName) {
        return lessonUserDataService.findByNombreUsuarioAndLessonIdAndModuleName(nombreUsuario, lessonId, moduleName);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public void store(@Valid @RequestBody LessonUserDataDTO dataDTO) {
        lessonUserDataService.store(dataDTO);
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public void update(@PathVariable Long id, @RequestBody LessonUserDataDTO dataDTO) {
        lessonUserDataService.update(id, dataDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        lessonUserDataService.delete(id);
    }
}
