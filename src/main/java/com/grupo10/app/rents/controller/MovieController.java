/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo10.app.rents.controller;

import com.grupo10.app.rents.entities.Client;
import com.grupo10.app.rents.entities.Movie;
import com.grupo10.app.rents.service.ClientService;
import com.grupo10.app.rents.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Andres
 */
@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*")
public class MovieController {

    @Autowired
    MovieService service;

    @GetMapping("")
    public Iterable<Client> get() {
        return service.get();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie create(@RequestBody Client request) {
        return service.create(request);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Movie update(@RequestBody Client request) {
        return service.update(request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") String id) {
        service.delete(id);
    }

}
