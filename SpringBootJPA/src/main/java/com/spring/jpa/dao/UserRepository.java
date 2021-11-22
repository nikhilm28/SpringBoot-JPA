package com.spring.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
