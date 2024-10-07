package com.example.dynamic.field.rendering.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dynamic.field.rendering.entity.UserInputs;
import com.example.dynamic.field.rendering.service.UserInputService;

@RestController
public class UserInputController {

	@Autowired
    private UserInputService userInputService;

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/user-inputs")
    public List<UserInputs> getAllUserInputs() {
        Iterable<UserInputs> userInputsIterable = userInputService.getAllUserInputs();
        List<UserInputs> userInputsList = new ArrayList<>();
        userInputsIterable.forEach(userInputsList::add); 
        return userInputsList;
    }
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/user-inputs/{userName}")
	public ResponseEntity<List<UserInputs>> getUserInputsByUserName(@PathVariable String userName) {
	    List<UserInputs> userInputs = userInputService.getUserInputsByUserName(userName);
	    return ResponseEntity.ok(userInputs);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/user-inputs")
    public ResponseEntity<Void> submitUserInputs(@RequestBody List<UserInputs> inputs) {
        userInputService.saveUserInputs(inputs);
        return ResponseEntity.ok().build();
    }
}
