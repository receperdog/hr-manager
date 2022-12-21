package com.open.hrmanager.services;

import com.open.hrmanager.models.Project;
import com.open.hrmanager.models.dtos.create.CreateProjectRequest;
import com.open.hrmanager.repositories.ProjectRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProjectService {
    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;
    public Project createProject(CreateProjectRequest createProjectRequest) {
        Project project = modelMapper.map(createProjectRequest, Project.class);
        return projectRepository.save(project);
    }
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public void deleteProject(UUID id) {
        projectRepository.deleteById(id);
    }
}
