INSERT INTO STUDENTS (ST_ID, FIRST_NAME, LAST_NAME, GENDER, DEGREE, MAJOR, GPA, EMAIL) VALUES(1, 'Sabina', 'Yashar', 'Female', 'Bachelor', 'Information Technologies', 3.33, 'smammadova2021@ada.edu.az')
INSERT INTO STUDENTS (ST_ID, FIRST_NAME, LAST_NAME, GENDER, DEGREE, MAJOR, GPA, EMAIL) VALUES(2, 'Mike', 'Chedolin', 'Male', 'Master', 'Data Analytics', 3.02, 'mchedolin2022@ada.edu.az')
INSERT INTO STUDENTS (ST_ID, FIRST_NAME, LAST_NAME, GENDER, DEGREE, MAJOR, GPA, EMAIL) VALUES(3, 'Mary', 'Mccarthy', 'Female', 'Master', 'Data Analytics', 3.73, 'mmccarthy2022@ada.edu.az')
INSERT INTO STUDENTS (ST_ID, FIRST_NAME, LAST_NAME, GENDER, DEGREE, MAJOR, GPA, EMAIL) VALUES(4, 'Sam', 'Stotesbery', 'Male', 'Bachelor', 'Computer Engineering', 2.82, 'sstotesbery2023@ada.edu.az')
INSERT INTO STUDENTS (ST_ID, FIRST_NAME, LAST_NAME, GENDER, DEGREE, MAJOR, GPA, EMAIL) VALUES(5, 'Louis', 'Chedolin', 'Male', 'Bachelor', 'Computer Sciences', 2.93, 'lchedolin2024@ada.edu.az')
INSERT INTO STUDENTS (ST_ID, FIRST_NAME, LAST_NAME, GENDER, DEGREE, MAJOR, GPA, EMAIL) VALUES(6, 'Ayna', 'Aghalarova', 'Female', 'Bachelor', 'Information Technologies', 3.22, 'aaghalarova2021@ada.edu.az')
INSERT INTO STUDENTS (ST_ID, FIRST_NAME, LAST_NAME, GENDER, DEGREE, MAJOR, GPA, EMAIL) VALUES(7, 'Liam', 'Mariano', 'Male', 'Bachelor', 'Computer Sciences', 3.01, 'lmariano2021@ada.edu.az')
INSERT INTO STUDENTS (ST_ID, FIRST_NAME, LAST_NAME, GENDER, DEGREE, MAJOR, GPA, EMAIL) VALUES(8, 'Hilal', 'Aktash', 'Female', 'Master', 'Data Analytics', 3.53, 'haktash2022@ada.edu.az')
INSERT INTO STUDENTS (ST_ID, FIRST_NAME, LAST_NAME, GENDER, DEGREE, MAJOR, GPA, EMAIL) VALUES(9, 'Anar', 'Jafarov', 'Male', 'Bachelor', 'Computer Engineering', 3.25, 'ajafarov2022@ada.edu.az')
INSERT INTO STUDENTS (ST_ID, FIRST_NAME, LAST_NAME, GENDER, DEGREE, MAJOR, GPA, EMAIL) VALUES(10, 'Luna', 'Choi', 'Female', 'Master', 'Data Analytics', 3.13, 'lchoi2022@ada.edu.az')

INSERT INTO COURSES (COURSE_ID, COURSE_NAME, AVAILABLE_TERM, COURSE_CREDIT, COURSE_TYPE, INSTRUCTOR) VALUES (1478, 'System Analysis & Design', 'Spring', 6, 'MC', 'Jamaladdin Hasanov')
INSERT INTO COURSES (COURSE_ID, COURSE_NAME, AVAILABLE_TERM, COURSE_CREDIT, COURSE_TYPE, INSTRUCTOR) VALUES (3876, 'Fundamentals of Databases', 'Fall', 6, 'MC', 'Fadai Ganjaliyev')
INSERT INTO COURSES (COURSE_ID, COURSE_NAME, AVAILABLE_TERM, COURSE_CREDIT, COURSE_TYPE, INSTRUCTOR) VALUES (6542, 'Business Process Modeling for IT Solutions', 'Spring', 6, 'MC', 'Emin Alasgarov')
INSERT INTO COURSES (COURSE_ID, COURSE_NAME, AVAILABLE_TERM, COURSE_CREDIT, COURSE_TYPE, INSTRUCTOR) VALUES (4937, 'Advanced Database Systems', 'Fall', 6, 'MC', 'Fadai Ganjaliyev')
INSERT INTO COURSES (COURSE_ID, COURSE_NAME, AVAILABLE_TERM, COURSE_CREDIT, COURSE_TYPE, INSTRUCTOR) VALUES (7822, 'IT Project Management', 'Spring', 6, 'MC', 'Jamaladdin Hasanov')
INSERT INTO COURSES (COURSE_ID, COURSE_NAME, AVAILABLE_TERM, COURSE_CREDIT, COURSE_TYPE, INSTRUCTOR) VALUES (6543, 'Introduction to Computer Networks', 'Fall', 6, 'MC', 'Emil Abbasov')
INSERT INTO COURSES (COURSE_ID, COURSE_NAME, AVAILABLE_TERM, COURSE_CREDIT, COURSE_TYPE, INSTRUCTOR) VALUES (8764, 'Probability & Statistics', 'Spring', 6, 'MC', 'Ilham Akhundov')
INSERT INTO COURSES (COURSE_ID, COURSE_NAME, AVAILABLE_TERM, COURSE_CREDIT, COURSE_TYPE, INSTRUCTOR) VALUES (5435, 'Civilization & Cultures', 'Fall', 6, 'GE', 'Jeyhun Rzayev')
INSERT INTO COURSES (COURSE_ID, COURSE_NAME, AVAILABLE_TERM, COURSE_CREDIT, COURSE_TYPE, INSTRUCTOR) VALUES (5676, 'Machine Learning', 'Spring', 6, 'TE', 'Samir Rustamov')

INSERT INTO ENROLLMENTS VALUES(1, 1478)
INSERT INTO ENROLLMENTS VALUES(1, 3876)
INSERT INTO ENROLLMENTS VALUES(1, 6542)
INSERT INTO ENROLLMENTS VALUES(1, 6543)
INSERT INTO ENROLLMENTS VALUES(1, 8764)
INSERT INTO ENROLLMENTS VALUES(1, 5435)
INSERT INTO ENROLLMENTS VALUES(2, 4937)
INSERT INTO ENROLLMENTS VALUES(2, 8764)
INSERT INTO ENROLLMENTS VALUES(3, 8764)
INSERT INTO ENROLLMENTS VALUES(3, 4937)
INSERT INTO ENROLLMENTS VALUES(3, 5676)
INSERT INTO ENROLLMENTS VALUES(4, 6543)
INSERT INTO ENROLLMENTS VALUES(4, 8764)
INSERT INTO ENROLLMENTS VALUES(4, 5435)
INSERT INTO ENROLLMENTS VALUES(5, 5435)
INSERT INTO ENROLLMENTS VALUES(5, 5676)
INSERT INTO ENROLLMENTS VALUES(6, 3876)
INSERT INTO ENROLLMENTS VALUES(6, 1478)
INSERT INTO ENROLLMENTS VALUES(6, 7822)
INSERT INTO ENROLLMENTS VALUES(6, 6542)
INSERT INTO ENROLLMENTS VALUES(6, 8764)
INSERT INTO ENROLLMENTS VALUES(7, 6542)
INSERT INTO ENROLLMENTS VALUES(7, 6543)
INSERT INTO ENROLLMENTS VALUES(7, 5435)
INSERT INTO ENROLLMENTS VALUES(7, 5676)
INSERT INTO ENROLLMENTS VALUES(8, 7822)
INSERT INTO ENROLLMENTS VALUES(8, 5676)
INSERT INTO ENROLLMENTS VALUES(8, 8764)
INSERT INTO ENROLLMENTS VALUES(9, 8764)
INSERT INTO ENROLLMENTS VALUES(9, 5435)
INSERT INTO ENROLLMENTS VALUES(9, 7822)
INSERT INTO ENROLLMENTS VALUES(10, 5676)
INSERT INTO ENROLLMENTS VALUES(10, 8764)
INSERT INTO ENROLLMENTS VALUES(10, 7822)