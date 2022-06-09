package com.javatpoint.apachederbyexample1.repository;

import org.springframework.data.repository.CrudRepository;

import com.javatpoint.apachederbyexample1.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, String>   
{    
} 