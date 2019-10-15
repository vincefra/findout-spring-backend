/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springjpa.controller;

import com.springjpa.model.CustomerDataMap;
import com.springjpa.model.User;
import com.springjpa.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author work
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IProjectService projectService;

    @CrossOrigin(origins = { "http://localhost:8080" }, allowCredentials = "false")
    @PostMapping("/auth")
    ResponseEntity<String> tryLogin(@RequestBody User user) {
        if (user.getUsername().equalsIgnoreCase("toshiko") && user.getPassword().equalsIgnoreCase("123")) 
            return ResponseEntity.ok("Welcome " + user.getUsername() + "!");
        else 
            return ResponseEntity.ok("Go away! " + user.getUsername() + "!");
    }
}
