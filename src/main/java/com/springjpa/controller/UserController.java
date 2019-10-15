/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springjpa.controller;

import com.springjpa.model.CustomerDataMap;
import com.springjpa.service.IProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @PostMapping("/auth")
    ResponseEntity<String> tryLogin(@RequestBody String username, String password) {
        if (username.equalsIgnoreCase("toshiko") && password.equalsIgnoreCase("123")) 
            return ResponseEntity.ok("yes" + username + " " + password);
        else 
            return ResponseEntity.ok("No" + username + " - " + password);
        
    }
}
