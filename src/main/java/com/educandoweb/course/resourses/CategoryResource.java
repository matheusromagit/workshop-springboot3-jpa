package com.educandoweb.course.resourses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.services.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;

    @GetMapping
    public List<Category> findAll() {
        return service.findAll();
    }
    
    @GetMapping(value="/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
    	Category obj = service.findById(id);
    	return ResponseEntity.ok().body(obj);
    }
}