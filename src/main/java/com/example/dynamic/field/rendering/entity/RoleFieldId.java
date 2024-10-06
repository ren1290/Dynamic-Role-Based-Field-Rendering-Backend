package com.example.dynamic.field.rendering.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class RoleFieldId implements Serializable {

    private Integer roleId; 
    
    private Integer fieldId; 
    
    public Integer getRoleId() {
        return roleId; 
    }

    public void setRoleId(Integer roleId) { 
        this.roleId = roleId;
    }

    public Integer getFieldId() {
        return fieldId; 
    }

    public void setFieldId(Integer fieldId) { 
        this.fieldId = fieldId;
    }

    public RoleFieldId(Integer roleId, Integer fieldId) { 
        super();
        this.roleId = roleId;
        this.fieldId = fieldId;
    }
    
    public RoleFieldId() {
        
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleFieldId)) return false;
        RoleFieldId that = (RoleFieldId) o;
        return Objects.equals(roleId, that.roleId) && Objects.equals(fieldId, that.fieldId); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, fieldId);
    }
}
