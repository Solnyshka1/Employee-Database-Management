![image](https://github.com/user-attachments/assets/d206180c-5e41-4da5-bd39-9c07567e7a4b)
![image](https://github.com/user-attachments/assets/47bd0536-d6ea-42c1-ad16-83a57e0606ce)

About This Project
This project is a Java program to manage employees. You can:

Add new employees.
See all employees.
Find an employee by ID.
Update employee information.
Remove (delete) an employee.
It uses PostgreSQL to store employee data.

What You Need to Run This Program
Software Needed:
Java: Install JDK version 17 or higher.
PostgreSQL: Install PostgreSQL database.

How to Set Up and Run
1.Open PostgreSQL
2.Create a database: CREATE DATABASE employee_db;
3.Create a table for employees:
CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    position VARCHAR(100) NOT NULL,
    salary NUMERIC(15, 2) NOT NULL,
    hire_date DATE NOT NULL
);


