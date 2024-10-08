package com.example.dynamic.field.rendering.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Fields {

    @Id
    @Column(name = "FIELD_ID")
    private Integer fieldId;

    @Column(name = "FIELD_NAME")
    private String fieldName;

    @Column(name = "FIELD_DESC")
    private String fieldDesc;

    @OneToMany(mappedBy = "field")
    @JsonManagedReference(value = "field-role-fields")
    private Set<RoleFields> roleFields;

    @Column(name = "FIELD_TYPE") 
    private String fieldType;

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldDesc() {
        return fieldDesc;
    }

    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc;
    }

    public Set<RoleFields> getRoleFields() {
        return roleFields;
    }

    public void setRoleFields(Set<RoleFields> roleFields) {
        this.roleFields = roleFields;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public Fields(Integer fieldId, String fieldName, String fieldDesc, String fieldType, Set<RoleFields> roleFields) {
        this.fieldId = fieldId;
        this.fieldName = fieldName;
        this.fieldDesc = fieldDesc;
        this.fieldType = fieldType; 
        this.roleFields = roleFields;
    }

    public Fields() {
    }
}
