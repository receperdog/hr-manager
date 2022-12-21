package com.open.hrmanager.controllers;

import com.open.hrmanager.models.Project;
import com.open.hrmanager.models.dtos.create.CreateProjectRequest;
import com.open.hrmanager.services.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/projects")
public class ProjectController {
    private final ProjectService projectService;
    @PostMapping("/create")
    public Project createProject(@RequestBody CreateProjectRequest createProjectRequest) {
        return projectService.createProject(createProjectRequest);
    }
    @GetMapping("/all")
    public List<Project> getAll(){
        return projectService.getAllProjects();
    }

}
