package com.springjpa.controller;

import com.springjpa.model.Project.ProjectDataMap;
import com.springjpa.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {
    
    @Autowired
    private IProjectService projectService;
 
    @RequestMapping("/all")
    ResponseEntity<List<ProjectDataMap>> getAllProjects() {
        return ResponseEntity.ok(projectService.findAll());
    }

    @RequestMapping("/all/zero")
    ResponseEntity<List<ProjectDataMap>> getAllProjectsStartIdZero() {
        return ResponseEntity.ok(projectService.findAllStartIdZero());
    }
    
    @RequestMapping("/total")
    ResponseEntity<Long> getTotalProjects() {
        return ResponseEntity.ok(projectService.getTotalProjects());
    }
    
    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }
}
