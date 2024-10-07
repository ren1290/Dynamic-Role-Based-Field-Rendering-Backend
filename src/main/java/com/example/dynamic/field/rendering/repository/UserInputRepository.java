package com.example.dynamic.field.rendering.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dynamic.field.rendering.entity.UserInputs;

@Repository
public interface UserInputRepository extends CrudRepository <UserInputs, Integer> {

}
