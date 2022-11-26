/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo10.app.rents.service;

import com.grupo10.app.rents.entities.Category;
import com.grupo10.app.rents.entities.Movie;
import com.grupo10.app.rents.interfaces.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Andres
 */
@Service
public class MovieService {

    @Autowired
    ICategoryRepository repository;

    public Iterable<Movie> get() {
        Iterable<Movie> response = repository.findAll();
        return response;
    }

    public Movie create(Movie request) {

        return repository.save(request);

    }

    public Category update(Category category) {
        Category categoryToUpdate = new Category();
        if (repository.existsById(category.getId())) {
            categoryToUpdate = category;
            repository.save(categoryToUpdate);
        }
        return categoryToUpdate;
    }

    public Boolean delete(Integer id) {
        repository.deleteById(id);
        Boolean deleted = true;
        return deleted;
    }
}
