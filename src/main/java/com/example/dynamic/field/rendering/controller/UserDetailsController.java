package com.example.dynamic.field.rendering.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dynamic.field.rendering.entity.Fields;
import com.example.dynamic.field.rendering.entity.RoleFields;
import com.example.dynamic.field.rendering.entity.UserDetails;
import com.example.dynamic.field.rendering.service.UserDetailsService;

@RestController
public class UserDetailsController {

	@Autowired
    private UserDetailsService userDetailsService;

	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody UserDetails userdetails) {
	    String userName = userdetails.getUserName();
	    String password = userdetails.getPassword();
	    
	    UserDetails user = userDetailsService.validateUser(userName, password);
	    
	    if (user == null) {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	    }
	    List<Fields> fields = userDetailsService.getFieldsWithRoleFieldDetails(user.getRole().getRoleId());

        return ResponseEntity.ok(fields);
	}


}
