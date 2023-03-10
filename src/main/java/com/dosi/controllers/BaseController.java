package com.dosi.controllers;

import com.dosi.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class BaseController<T> {

    @Autowired
    private BaseService<T> service;

    @PostMapping("/")
    public T create(@RequestBody T entity) {
        return service.create(entity);
    }

    @GetMapping("/{id}")
    public T read(@PathVariable Long id) {
        return service.read(id);
    }

    @PutMapping("/")
    public T update(@RequestBody T entity) {
        return service.update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}