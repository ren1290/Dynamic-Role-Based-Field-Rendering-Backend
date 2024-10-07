package com.example.dynamic.field.rendering.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER_INPUTS")
public class UserInputs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "RECORD_ID")
    private Integer recordId; // New field for RECORD_ID

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "FIELD_ID")
    private Integer fieldId;

    @Column(name = "FIELD_VALUE")
    private String value;

    // Constructors
    public UserInputs(Integer id, Integer recordId, String userName, Integer fieldId, String value) {
        this.id = id;
        this.recordId = recordId; // Initialize recordId
        this.userName = userName;
        this.fieldId = fieldId;
        this.value = value;
    }

    public UserInputs() {
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
