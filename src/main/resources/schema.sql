CREATE TABLE IF NOT EXISTS Role (
    ROLE_ID INT PRIMARY KEY,
    ROLE_NAME VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS Fields (
    FIELD_ID INT PRIMARY KEY,
    FIELD_NAME VARCHAR(255),
    FIELD_DESC VARCHAR(255),
    FIELD_TYPE VARCHAR(50),
    OPTIONS TEXT
);

CREATE TABLE IF NOT EXISTS USER_DETAILS (
    USER_NAME VARCHAR(255) PRIMARY KEY,
    password VARCHAR(255),
    ROLE_ID INT,
    FOREIGN KEY (ROLE_ID) REFERENCES Role(ROLE_ID)
);

CREATE TABLE IF NOT EXISTS ROLE_FIELDS (
    ROLE_ID INT,
    FIELD_ID INT,
    PRIMARY KEY (ROLE_ID, FIELD_ID),
    FOREIGN KEY (ROLE_ID) REFERENCES Role(ROLE_ID),
    FOREIGN KEY (FIELD_ID) REFERENCES Fields(FIELD_ID)
);

CREATE TABLE IF NOT EXISTS USER_INPUTS (
    ID SERIAL PRIMARY KEY,         
    RECORD_ID INT,                 
    USER_NAME VARCHAR(255),        
    FIELD_ID INT,                  
    FIELD_VALUE VARCHAR(255),      
    FOREIGN KEY (USER_NAME) REFERENCES USER_DETAILS(USER_NAME),
    FOREIGN KEY (FIELD_ID) REFERENCES Fields(FIELD_ID)
);



