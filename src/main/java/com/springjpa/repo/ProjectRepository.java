package com.springjpa.repo;

import com.springjpa.model.Project.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long>{

}
