package com.springboot.crud.operation.service;

import java.util.List;
import java.util.Optional;

import com.springboot.crud.operation.model.User;

public interface UserService {
	
	Optional<User> findUserById(long id);
	List<User> findAllUser();
	User saveUser(User usr);
}
