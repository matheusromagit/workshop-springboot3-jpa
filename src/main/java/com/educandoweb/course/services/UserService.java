package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        List<User> users = repository.findAll();
        logger.info("Users retrieved: {}", users);
        return users;
    }
    public User findById(Long id) {
    	Optional<User> obj = repository.findById(id);
    	return obj.get();
    }
    
    public User insert(User obj) {
    	return repository.save(obj);
    }
}
