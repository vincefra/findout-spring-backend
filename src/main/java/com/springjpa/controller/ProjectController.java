package com.springjpa.controller;

import com.springjpa.model.Project.ProjectDataMap;
import com.springjpa.model.Project.ProjectDataMapNoArrays;
import com.springjpa.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author work
 */

@RestController
@RequestMapping("/project")
public class ProjectController {
    
    @Autowired
    private IProjectService projectService;
 
    @RequestMapping("/findall")
    ResponseEntity<List<ProjectDataMap>> getAllProjects() {
        return ResponseEntity.ok(projectService.findAll());
    }
    
    @RequestMapping("/findallnoarray")
    ResponseEntity<List<ProjectDataMapNoArrays>> getAllProjectsNoArrays() {
        return ResponseEntity.ok(projectService.findAllNoArrays());
    }
    
    @RequestMapping("/findallarrayzero")
    ResponseEntity<List<ProjectDataMap>> findAllArraysIdZero() {
        return ResponseEntity.ok(projectService.findAllArraysIdZero());
    }
    
    @GetMapping("/ping")
    public String ping() {
        return "OK";
    }
}
