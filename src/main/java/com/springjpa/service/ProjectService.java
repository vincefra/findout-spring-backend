package com.springjpa.service;

import com.springjpa.model.Project.Project;
import com.springjpa.repo.ProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService implements IProjectService {

    private final ProjectRepository repository;

    @Autowired
    public ProjectService(ProjectRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Project> findAllProjects() {

        return (List<Project>) repository.findAll();
    }
}
