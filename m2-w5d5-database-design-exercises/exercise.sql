BEGIN TRANSACTION;

CREATE TABLE department (
        department_id serial NOT NULL UNIQUE,
        name varchar(255) NOT NULL,
        CONSTRAINT pk_department_deparment_id PRIMARY KEY (department_id)
);

CREATE TABLE employee (
        employee_id serial NOT NULL UNIQUE,
        job_title varchar(255) NOT NULL,
        last_name varchar(255) NOT NULL,
        first_name varchar(255) NOT NULL,
        isfemale boolean NOT NULL,
        birthday date NOT NULL,
        hire_date date NOT NULL,
        department_id integer ,
        CONSTRAINT fk_department_id FOREIGN KEY (department_id) REFERENCES department(department_id),
        CONSTRAINT pk_employee_employee_id PRIMARY KEY (employee_id)
 );
 
CREATE TABLE project (
       project_id serial NOT NULL UNIQUE,
       name varchar(255) NOT NULL,
       start_date date NOT NULL,
       CONSTRAINT pk_project_project_id PRIMARY KEY (project_id)
);

CREATE TABLE employee_project (
       employee_id integer NOT NULL,
       project_id integer NOT NULL,
       CONSTRAINT fk_employee_id FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
       CONSTRAINT fk_project_id FOREIGN KEY (project_id) REFERENCES project(project_id)
);
      

COMMIT;

ROLLBACK; 



BEGIN TRANSACTION;

INSERT INTO project (name, start_date)
VALUES ('Uno', '2017-08-14')

INSERT INTO project (name, start_date)
VALUES ('THIS PROJECT SUCKS', '2017-08-29')

INSERT INTO project (name, start_date)
VALUES ('WHO cArEs', '2017-09-02')

INSERT INTO project (name, start_date)
VALUES ('Oh Come On', '2017-08-15')

SELECT * FROM project 

COMMIT;

ROLLBACK;



BEGIN TRANSACTION;

INSERT INTO department (name)
VALUES ('Accounting')

INSERT INTO department (name)
VALUES ('HR')

INSERT INTO department (name)
VALUES ('Idiots')

SELECT * FROM department

COMMIT;

ROLLBACK;


BEGIN TRANSACTION;

INSERT INTO employee (job_title, last_name, first_name, isfemale, birthday, hire_date, department_id)
VALUES ('Manager', 'Phil', 'McCracken', false, '1991-04-12' , '2012-05-15', (SELECT department_id FROM department WHERE name = 'HR'))

INSERT INTO employee (job_title, last_name, first_name, isfemale, birthday, hire_date, department_id)
VALUES ('Assistant Manager', 'Joe', 'Schmoe', false, '1984-04-10' , '2012-06-15', (SELECT department_id FROM department WHERE name = 'HR'))

INSERT INTO employee (job_title, last_name, first_name, isfemale, birthday, hire_date, department_id)
VALUES ('Manager', 'Dude', 'Dude', true, '1992-12-12' , '2011-05-15', (SELECT department_id FROM department WHERE name = 'Accounting'))

INSERT INTO employee (job_title, last_name, first_name, isfemale, birthday, hire_date, department_id)
VALUES ('Assistant Manager', 'Sweet', 'Sweet', true, '1990-06-14' , '2014-05-15', (SELECT department_id FROM department WHERE name = 'Accounting'))

INSERT INTO employee (job_title, last_name, first_name, isfemale, birthday, hire_date, department_id)
VALUES ('Employee', 'Liz', 'McCracken', true, '1991-04-12' , '2012-05-15', (SELECT department_id FROM department WHERE name = 'HR'))

INSERT INTO employee (job_title, last_name, first_name, isfemale, birthday, hire_date, department_id)
VALUES ('Employee', 'Jane', 'Girth', false, '1994-06-12' , '2012-05-15', (SELECT department_id FROM department WHERE name = 'HR'))

INSERT INTO employee (job_title, last_name, first_name, isfemale, birthday, hire_date, department_id)
VALUES ('Employee', 'Dudet', 'Dudet', true, '1991-12-12' , '2011-05-15', (SELECT department_id FROM department WHERE name = 'Accounting'))

INSERT INTO employee (job_title, last_name, first_name, isfemale, birthday, hire_date, department_id)
VALUES ('Janitor', 'Beth', 'Hen', true, '1990-09-14' , '2014-05-15', (SELECT department_id FROM department WHERE name = 'Accounting'))


SELECT * FROM employee

COMMIT;

ROLLBACK;

BEGIN TRANSACTION;

INSERT INTO employee_project (project_id, employee_id)
VALUES ((SELECT project_id FROM project WHERE name = 'THIS PROJECT SUCKS'),(SELECT employee_id FROM employee WHERE last_name = 'Jane'))

INSERT INTO employee_project (project_id, employee_id)
VALUES ((SELECT project_id FROM project WHERE name = 'Uno'),(SELECT employee_id FROM employee WHERE last_name = 'Dudet'))

INSERT INTO employee_project (project_id, employee_id)
VALUES ((SELECT project_id FROM project WHERE name = 'WHO cArEs'),(SELECT employee_id FROM employee WHERE last_name = 'Liz'))

INSERT INTO employee_project (project_id, employee_id)
VALUES ((SELECT project_id FROM project WHERE name = 'Oh Come On'),(SELECT employee_id FROM employee WHERE last_name = 'Sweet'))


SELECT * FROM employee_project

COMMIT;

ROLLBACK;

BEGIN TRANSACTION;

UPDATE employee SET department_id = (SELECT department_id FROM department WHERE name = 'Idiots')
WHERE job_title = 'Employee'

SELECT * FROM employee
COMMIT;

ROLLBACK;

select * from city where countrycode = 'CAN'