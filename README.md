📚 Library Management System — Java + MySQL

By Naveen K

A fully functional Library Management System developed using Java, Object-Oriented Programming (OOP) principles, and MySQL as the backend database.
This project demonstrates complete role-based library operations with clean architecture and a modular, maintainable codebase.

🚀 Features Overview
🔐 Role-Based Access

✔ Borrower
✔ Clerk
✔ Librarian
✔ Administrator

Each role has different permissions and responsibilities.

👤 Borrower Capabilities

Search books by title, author, or subject

Place books on hold

View borrowed books

View personal details

Check outstanding fines

🧾 Clerk Capabilities

Includes all borrower features, plus:

Issue books

Return books

Renew borrowed books

Add new borrowers

Update borrower information

Manage fines

📚 Librarian Capabilities

Includes all clerk features, plus:

Add new books

Delete books

Modify book details

🛠 Administrator Capabilities

Add clerks

Add librarians

View all books

View complete issued books history

Admin password: lib

🗄 Database (MySQL) Setup

The project uses MySQL as the storage engine.

✔ Database Name:
lms_db

✔ Tables Included:

book

borrower

clerk

librarian

loan

staff

person

borrowed_book

on_hold_book

(Complete SQL schema included in repository)

🧩 System Architecture

This project follows core OOP principles:

Abstraction

Encapsulation

Inheritance

Polymorphism

Main Classes:
Book
Borrower
Clerk
Librarian
Staff
Person
Loan
HoldRequest
HoldRequestOperations
Library
DBConnection (MySQL)
Main


Each class represents a real-world entity with proper attributes and behaviors.

🖥 User Interface

The system runs through a console-based UI, making it lightweight and clean.

Sample:
Welcome to Library Management System
1. Login
2. Exit
3. Administrative Functions

⚙ How to Run
1️⃣ Install Requirements

Java (JDK 8/11/17)

NetBeans / IntelliJ / Eclipse

MySQL Server

MySQL Connector JAR (already included)

2️⃣ Create Database in MySQL

Run:

CREATE DATABASE lms_db;
USE lms_db;


Then create all necessary tables using SQL file provided.

3️⃣ Configure Database Connection

In DBConnection.java:

private static final String URL = "jdbc:mysql://localhost:3306/lms_db";
private static final String USER = "root";
private static final String PASS = "YourPassword";

4️⃣ Run Main Program

Open NetBeans → Run Main.java
Admin password: lib

You can now use Clerk, Librarian, or Borrower accounts.




👨‍💻 Author
Naveen K

Passionate about backend development, databases, and Java technologies.

Connect with me:

GitHub: https://github.com/Naveenk458

LinkedIn: linkedin.com/in/naveen-k-2bbb81232
