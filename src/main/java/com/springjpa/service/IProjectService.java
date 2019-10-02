package com.springjpa.service;

import com.springjpa.model.Project.Project;
import java.util.List;

public interface IProjectService {
    public List<Project> findAllProjects();
    
}
