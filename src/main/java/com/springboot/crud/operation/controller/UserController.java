package com.springboot.crud.operation.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crud.operation.model.User;
import com.springboot.crud.operation.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping({"/api/v1/user"})
@Slf4j
public class UserController {

	@Autowired
    private UserService usrService;

    @GetMapping
    public List<User> findAll() {
        return usrService.findAllUser();
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(usrService.saveUser(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable long id) {

        Optional<User> user = usrService.findUserById(id);

        if (!user.isPresent()) {
            log.error("User with id " + id + " does not exist.");
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user.get());
    }

}
