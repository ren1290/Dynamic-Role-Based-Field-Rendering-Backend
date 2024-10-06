package com.example.dynamic.field.rendering.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.dynamic.field.rendering.entity.Fields;

@Repository
public interface FieldsRepository extends CrudRepository<Fields, Integer> {

}
