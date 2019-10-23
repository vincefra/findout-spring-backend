package com.springjpa.service;

import com.springjpa.model.Project.ProjectDataMap;
import com.springjpa.model.Project.ProjectEmployeeMap;
import java.util.List;

public interface IProjectService {
    public List<ProjectDataMap> findAll();
    public List<ProjectDataMap> findAllStartIdZero();
    public long getTotalProjects();
    public List<ProjectEmployeeMap> findAllProjectsByEmployee(long id);
}
