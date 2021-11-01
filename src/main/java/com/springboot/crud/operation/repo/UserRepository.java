package com.springboot.crud.operation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.crud.operation.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
