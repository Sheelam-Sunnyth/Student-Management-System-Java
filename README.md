<div align="center">

# 🧑‍🎓 Student Management System  
### *(Java + Swing GUI + MySQL + JDBC)*

A complete desktop-based Student Management System built using **Java**, **Swing GUI**, and **MySQL**, featuring CRUD operations, searching, sorting, and a clean graphical interface.

---

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql)
![Swing](https://img.shields.io/badge/Java-Swing-green?style=for-the-badge)
![Platform](https://img.shields.io/badge/Platform-Windows%20%7C%20Linux%20%7C%20Mac-lightgrey?style=for-the-badge)

</div>

---

## 📚 Table of Contents
- [Project Overview](#-project-overview)
- [Features](#-features)
- [Project Architecture](#-project-architecture)
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

---

## 🚀 Features

### 🎓 Student Operations
- Add new students  
- Modify details  
- Search by:
  - Student ID  
  - Last Name  
  - Major  
- Sort by:
  - First Name  
  - Last Name  
  - Major  

### 🖥 GUI
- Java Swing interface  
- JTable to display results  

---

## 🧱 Project Architecture

Student-Management-System/
│
├── src/
│ ├── AppGUI.java
│ ├── dbConnect.java
│ ├── Table.java
│ └── Main.java
│
├── lib/
│ └── mysql-connector-j-9.5.0.jar
│
├── student_data.sql
├── .gitignore
└── README.md

yaml
Copy code

---

## 📥 Clone the Repository

```bash
git clone https://github.com/Sheelam-Sunnyth/Student-Management-System-Java.git
bash
Copy code
cd Student-Management-System-Java
🗄 Database Setup
1️⃣ Create MySQL Database
sql
Copy code
CREATE DATABASE studentdb;
USE studentdb;
2️⃣ Import the SQL File
pgsql
Copy code
student_data.sql
🔌 Configure Database Connection
In dbConnect.java:

java
Copy code
String url = "jdbc:mysql://localhost:3306/studentdb?useSSL=false&serverTimezone=UTC";
String user = "root";
String pass = "1236";   // change this to your MySQL password
🏃 How to Run the Project
▶ Run using VS Code
Open the project

Open Main.java

Click Run ▶

▶ Run using Terminal
Compile:
bash
Copy code
javac -d bin -cp "lib/*" src/*.java
Run:
bash
Copy code
java -cp "bin;lib/*" Main
🛠 Tech Stack
Component	Technology
Language	Java
GUI Framework	Swing
Database	MySQL
Connectivity	JDBC
IDE	VS Code

🔮 Future Enhancements
Better UI (GridBag/JavaFX)
Login/Authentication
Pagination
Dark Mode
Export to Excel/CSV

✨ Author
Sunnyth Sheelam
📍 Hyderabad, India
🎓 AIML Student
🔗 GitHub: Sheelam-Sunnyth