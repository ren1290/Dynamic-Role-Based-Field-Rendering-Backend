package com.example.dynamic.field.rendering.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.dynamic.field.rendering.entity.UserInputs;

@Repository
public interface UserInputRepository extends CrudRepository <UserInputs, Integer> {

	List<UserInputs> findByUserName(String userName);

	@Query("SELECT MAX(u.recordId) FROM UserInputs u WHERE u.userName = ?1")
    Integer findMaxRecordIdByUserName(String userName);
	
	@Modifying
    @Query("UPDATE UserInputs u SET u.value = :value WHERE u.recordId = :recordId AND u.userName = :userName AND u.fieldId = :fieldId")
    void updateUserInput(String value, int recordId, String userName, Integer fieldId);
}
