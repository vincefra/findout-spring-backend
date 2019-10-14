package com.springjpa.service;

import com.springjpa.model.Project.ProjectDataMap;
import com.springjpa.model.Project.ProjectDataMapNoArrays;
import java.util.List;

public interface IProjectService {
    public List<ProjectDataMap> findAll();
    public List<ProjectDataMapNoArrays> findAllNoArrays();
    public List<ProjectDataMap> findAllStartIdZero();
    public long getTotalProjects();
}
