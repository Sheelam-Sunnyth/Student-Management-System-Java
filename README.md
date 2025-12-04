<div align="center">

# 🧑‍🎓 Student Management System  
### *(Java + Swing GUI + MySQL + JDBC)*

A complete desktop-based Student Management System built using **Java**, **Swing GUI**, and **MySQL**, featuring CRUD operations, searching, sorting, and a clean graphical interface.

---

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![Swing](https://img.shields.io/badge/Java-Swing-green?style=for-the-badge)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=for-the-badge)
![Platform](https://img.shields.io/badge/Platform-Windows%20%7C%20Linux%20%7C%20Mac-lightgrey?style=for-the-badge)

</div>

---

## 📚 Table of Contents
- [Project Overview](#-project-overview)
- [Features](#-features)
- [Architecture](#-project-architecture)
- [Clone the Repository](#-clone-the-repository)
- [Database Setup](#-database-setup)
- [Configure JDBC](#-configure-database-connection)
- [Run the Project](#-how-to-run-the-project)
- [Tech Stack](#-tech-stack)
- [Future Enhancements](#-future-enhancements)
- [Author](#-author)

---

## 📋 Project Overview

This Student Management System is a **Java Swing-based desktop application** that uses **MySQL** to store student details.  
It allows users to:

- Add student information  
- View all student records  
- Search students by ID, Last Name, or Major  
- Sort records by First Name, Last Name, or Major  
- Modify student details  
- Display results in a JTable GUI  

Ideal for learning **OOP**, **GUI programming**, and **JDBC database connectivity**.

---

🚀 Features
🎓 Student Operations
Add new students

Modify existing details

Search by:

Student ID

Last Name

Major

Sort by:

First Name

Last Name

Major

🖥 GUI
Java Swing-based clean interface

JTable to display results

Easy navigation buttons

🗄 Database
MySQL backend

JDBC connectivity

Prepared SQL schema included (student_data.sql)

🧱 Project Architecture
pgsql
Copy code
Student-Management-System/
│
├── src/
│   ├── AppGUI.java        # Main application GUI
│   ├── dbConnect.java     # JDBC MySQL connection
│   ├── Table.java         # Converts ResultSet → JTable model
│   └── Main.java          # Entry point
│
├── lib/
│   └── mysql-connector-j-9.5.0.jar
│
├── student_data.sql
├── .gitignore
├── LICENSE
└── README.md
📥 Clone the Repository
Run the following command:

bash
Copy code
git clone https://github.com/<your-username>/Student-Management-System-Java.git
Move into the project folder:

bash
Copy code
cd Student-Management-System-Java
🗄 Database Setup
1️⃣ Create MySQL Database
sql
Copy code
CREATE DATABASE studentdb;
USE studentdb;
2️⃣ Import SQL File
File: student_data.sql

This creates sdata table with sample student entries.

🔌 Configure DATABASE Connection
Update dbConnect.java:

java
Copy code
String url = "jdbc:mysql://localhost:3306/studentdb?useSSL=false&serverTimezone=UTC";
String user = "root";
String pass = "1236";   // change to your MySQL password
🏃 How to Run the Project
▶ Run using VS Code
Open the folder in VS Code

Open Main.java

Click Run ▶

▶ Run using Terminal (Windows)
Compile
bash
Copy code
javac -d bin -cp "lib/*" src/*.java
Run
bash
Copy code
java -cp "bin;lib/*" Main

🛠 Tech Stack
Component	Technology
Programming Language	Java
GUI Framework	Swing
Database	MySQL
Connectivity	JDBC
IDE	VS Code
Extensions	Java Extension Pack

🔮 Future Enhancements
Improved UI layout (GridBag / JavaFX)
Login & Authentication
Pagination for large records
Export to CSV / Excel
Dark Mode UI
REST API backend version

✨ Author
Sunnyth Sheelam
📍 Hyderabad, India
🎓 AIML Student
🔗 GitHub: Sheelam-Sunnyth