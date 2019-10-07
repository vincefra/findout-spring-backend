package com.springjpa.service;

import com.springjpa.model.Project.ProjectDataMap;
import java.util.List;

public interface IProjectService {
    public List<ProjectDataMap> findAll();
    
}
