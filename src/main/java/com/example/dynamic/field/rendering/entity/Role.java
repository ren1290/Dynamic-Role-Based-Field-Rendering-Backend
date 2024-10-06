package com.example.dynamic.field.rendering.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROLE")
public class Role {
	
	@Id
	@Column(name="ROLE_ID")
	private Integer roleId; 
	
	@Column(name="ROLE_NAME")
    private String roleName;
    
    @OneToMany(mappedBy = "role")
    @JsonManagedReference(value = "role-user-details")
    private Set<UserDetails> userDetails;

    @OneToMany(mappedBy = "role")
    @JsonManagedReference(value = "role-role-fields")
    private Set<RoleFields> roleFields;

	public Integer getRoleId() {
		return roleId; 
	}

	public void setRoleId(Integer roleId) { 
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<UserDetails> getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(Set<UserDetails> userDetails) {
		this.userDetails = userDetails;
	}

	public Set<RoleFields> getRoleFields() {
		return roleFields;
	}

	public void setRoleFields(Set<RoleFields> roleFields) {
		this.roleFields = roleFields;
	}

	public Role(Integer roleId, String roleName, Set<UserDetails> userDetails, Set<RoleFields> roleFields) {
		super();
		this.roleId = roleId; 
		this.roleName = roleName;
		this.userDetails = userDetails;
		this.roleFields = roleFields;
	}

    public Role() {
    }
}
