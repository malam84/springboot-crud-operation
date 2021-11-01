package com.springboot.crud.operation.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crud.operation.model.User;
import com.springboot.crud.operation.repo.UserRepository;
import com.springboot.crud.operation.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public Optional<User> findUserById(long id) {
		return userRepository.findById(id);
	}

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User saveUser(User usr) {
		return userRepository.save(usr);
	}

}
