package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

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
    	return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }
    
    public User insert(User obj) {
    	return repository.save(obj);
    }
    
    public Void delete(Long id) {
    	repository.deleteById(id);
		return null;
    }
    
    public  User update(Long id, User obj) {
    	User entity = repository.getReferenceById(id);
    	updateData(entity, obj);	
    	return repository.save(entity);
    }
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
