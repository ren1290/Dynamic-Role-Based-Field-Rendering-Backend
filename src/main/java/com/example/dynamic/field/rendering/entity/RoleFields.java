package com.example.dynamic.field.rendering.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="ROLE_FIELDS")
public class RoleFields {
	
	@EmbeddedId
    private RoleFieldId id;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "ROLE_ID")
    @JsonBackReference
    (value = "role-role-fields")
    private Role role;

    @ManyToOne
    @MapsId("fieldId")
    @JoinColumn(name = "FIELD_ID")
    @JsonBackReference(value = "field-role-fields")
    private Fields field;
    
	public RoleFieldId getId() {
		return id;
	}

	public void setId(RoleFieldId id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Fields getField() {
		return field;
	}

	public void setField(Fields field) {
		this.field = field;
	}

	public RoleFields(RoleFieldId id, Role role, Fields field) {
		super();
		this.id = id;
		this.role = role;
		this.field = field;
	}
	
	public RoleFields() {
		
	}
  
}
