CREATE DATABASE lms_db;
USE lms_db;

CREATE TABLE book(
    id INT PRIMARY KEY,
    title VARCHAR(100),
    author VARCHAR(100),
    subject VARCHAR(100),
    issued BOOLEAN DEFAULT 0
);

CREATE TABLE borrower(
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(20)
);