package com.example.dynamic.field.rendering.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dynamic.field.rendering.entity.Fields;
import com.example.dynamic.field.rendering.entity.UserDetails;
import com.example.dynamic.field.rendering.repository.RoleFieldsRepository;
import com.example.dynamic.field.rendering.repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	
	@Autowired
    private UserDetailsRepository userDetailsRepository;

    @Autowired
    private RoleFieldsRepository roleFieldsRepository;

    public UserDetails validateUser(String userName, String password) {
        UserDetails userDetails = userDetailsRepository.findByUserName(userName);
        if (userDetails != null && userDetails.getPassword().equals(password)) {
            return userDetails;
        }
        return null; 
    }

    public List<Fields> getFieldsWithRoleFieldDetails(int roleId) {
        return roleFieldsRepository.findFieldsByRoleId(roleId); 
    }

}


