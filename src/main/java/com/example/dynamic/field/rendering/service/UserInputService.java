package com.example.dynamic.field.rendering.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dynamic.field.rendering.entity.UserInputs;
import com.example.dynamic.field.rendering.repository.UserInputRepository;

@Service
public class UserInputService {

	@Autowired
    private UserInputRepository userInputRepository;

	public Iterable<UserInputs> getAllUserInputs() {
        return userInputRepository.findAll(); 
    }
	
    public void saveUserInputs(List<UserInputs> inputs) {
        userInputRepository.saveAll(inputs);
    }
}
