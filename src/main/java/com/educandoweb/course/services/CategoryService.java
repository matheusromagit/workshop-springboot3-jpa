package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service
public class CategoryService {

    private static final Logger logger = LoggerFactory.getLogger(CategoryService.class);

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        List<Category> categories = repository.findAll();
        logger.info("Categories retrieved: {}", categories);
        return categories;
    }
    public Category findById(Long id) {
    	Optional<Category> obj = repository.findById(id);
    	return obj.get();
    }

}
