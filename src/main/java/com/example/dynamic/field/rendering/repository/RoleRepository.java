package com.example.dynamic.field.rendering.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dynamic.field.rendering.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{

}
