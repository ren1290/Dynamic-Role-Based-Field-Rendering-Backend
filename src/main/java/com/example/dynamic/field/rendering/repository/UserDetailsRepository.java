package com.example.dynamic.field.rendering.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dynamic.field.rendering.entity.UserDetails;

@Repository
public interface UserDetailsRepository extends CrudRepository <UserDetails, String> {

	UserDetails findByUserName(String userName);
}
