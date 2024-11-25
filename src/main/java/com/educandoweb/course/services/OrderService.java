package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {

    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        List<Order> users = repository.findAll();
        logger.info("Users retrieved: {}", users);
        return users;
    }
    public Order findById(Long id) {
    	Optional<Order> obj = repository.findById(id);
    	return obj.get();
    }
}
