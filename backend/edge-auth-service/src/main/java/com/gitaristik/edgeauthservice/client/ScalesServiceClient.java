package com.gitaristik.edgeauthservice.client;

import com.gitaristik.edgeauthservice.dto.LessonDTO;
import com.gitaristik.edgeauthservice.model.Subject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("scales-service")
public interface ScalesServiceClient {
    @GetMapping("/lessons")
    public List<LessonDTO> getAllLessons();

    @GetMapping("/lessons/{id}")
    public LessonDTO getLessonById(@PathVariable Long id);

    @GetMapping("/subjects")
    public List<Subject> getAllSubjects();

    @GetMapping("/subjects/{id}")
    public Subject getSubjectById(@PathVariable Long id);
}
