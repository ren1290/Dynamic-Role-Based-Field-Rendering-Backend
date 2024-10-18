package com.example.dynamic.field.rendering.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dynamic.field.rendering.entity.UserInputs;
import com.example.dynamic.field.rendering.repository.UserInputRepository;

import jakarta.transaction.Transactional;

@Service
public class UserInputService {

	@Autowired
    private UserInputRepository userInputRepository;

	public Iterable<UserInputs> getAllUserInputs() {
        return userInputRepository.findAll(); 
    }
	
	public List<UserInputs> getUserInputsByUserName(String userName) {
	    return userInputRepository.findByUserName(userName);
	}
	
	public void saveUserInputs(List<UserInputs> inputs) {
        if (inputs == null || inputs.isEmpty()) return;

        String userName = inputs.get(0).getUserName(); 

        Integer maxRecordId = userInputRepository.findMaxRecordIdByUserName(userName);
        int newRecordId = (maxRecordId == null) ? 1 : maxRecordId + 1; 

        for (UserInputs input : inputs) {
            input.setRecordId(newRecordId); 
        }

        userInputRepository.saveAll(inputs);
    }
	
	@Transactional
	public void updateUserInputs(String userName, int recordId, Map<Integer, String> updatedFields) {
	    for (Map.Entry<Integer, String> entry : updatedFields.entrySet()) {
	        Integer fieldId = entry.getKey(); // This should be of type Integer
	        String fieldValue = entry.getValue(); // This should be of type String

	        // Call the update method with correct parameter types and order
	        userInputRepository.updateUserInput(fieldValue, recordId, userName, fieldId); // Ensure this line matches the method signature
	    }
	}

}
