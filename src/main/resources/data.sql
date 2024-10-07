INSERT INTO Role (ROLE_ID, ROLE_NAME) VALUES (1, 'Regular');
INSERT INTO Role (ROLE_ID, ROLE_NAME) VALUES (2, 'Admin');


INSERT INTO Fields (FIELD_ID, FIELD_NAME, FIELD_DESC) VALUES (1, 'First Name', 'First name of Regular/Admin user');
INSERT INTO Fields (FIELD_ID, FIELD_NAME, FIELD_DESC) VALUES (2, 'Last Name', 'Last name of Regular/Admin user');
INSERT INTO Fields (FIELD_ID, FIELD_NAME, FIELD_DESC) VALUES (3, 'Designation', 'Designation of Regular/Admin user');
INSERT INTO Fields (FIELD_ID, FIELD_NAME, FIELD_DESC) VALUES (4, 'Phone', 'Phone number of Regular/Admin user');
INSERT INTO Fields (FIELD_ID, FIELD_NAME, FIELD_DESC) VALUES (5, 'Address', 'Address of Regular/Admin user');


INSERT INTO USER_DETAILS (USER_NAME, password, ROLE_ID) VALUES ('userA', '123', 1);
INSERT INTO USER_DETAILS (USER_NAME, password, ROLE_ID) VALUES ('userB', '567', 2);


INSERT INTO ROLE_FIELDS (ROLE_ID, FIELD_ID) VALUES (1, 1);
INSERT INTO ROLE_FIELDS (ROLE_ID, FIELD_ID) VALUES (1, 2);
INSERT INTO ROLE_FIELDS (ROLE_ID, FIELD_ID) VALUES (1, 3);
INSERT INTO ROLE_FIELDS (ROLE_ID, FIELD_ID) VALUES (2, 1);
INSERT INTO ROLE_FIELDS (ROLE_ID, FIELD_ID) VALUES (2, 2);
INSERT INTO ROLE_FIELDS (ROLE_ID, FIELD_ID) VALUES (2, 3);
INSERT INTO ROLE_FIELDS (ROLE_ID, FIELD_ID) VALUES (2, 4);
INSERT INTO ROLE_FIELDS (ROLE_ID, FIELD_ID) VALUES (2, 5);

INSERT INTO USER_INPUTS (RECORD_ID, USER_NAME, FIELD_ID, FIELD_VALUE) VALUES (1, 'userA', 1, 'Jane');
INSERT INTO USER_INPUTS (RECORD_ID, USER_NAME, FIELD_ID, FIELD_VALUE) VALUES (1, 'userA', 2, 'Doe');
INSERT INTO USER_INPUTS (RECORD_ID, USER_NAME, FIELD_ID, FIELD_VALUE) VALUES (1, 'userA', 3, 'Teacher');
INSERT INTO USER_INPUTS (RECORD_ID, USER_NAME, FIELD_ID, FIELD_VALUE) VALUES (2, 'userA', 1, 'John');
INSERT INTO USER_INPUTS (RECORD_ID, USER_NAME, FIELD_ID, FIELD_VALUE) VALUES (2, 'userA', 2, 'Smith');
INSERT INTO USER_INPUTS (RECORD_ID, USER_NAME, FIELD_ID, FIELD_VALUE) VALUES (2, 'userA', 3, 'Engineer');


