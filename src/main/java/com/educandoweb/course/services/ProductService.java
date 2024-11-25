package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service
public class ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        List<Product> products = repository.findAll();
        logger.info("Categories retrieved: {}", products);
        return products;
    }
    public Product findById(Long id) {
    	Optional<Product> obj = repository.findById(id);
    	return obj.get();
    }

}
