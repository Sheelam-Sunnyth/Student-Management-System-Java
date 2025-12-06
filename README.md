<div align="center">

# 🧑‍🎓 Student Management System  
### *(Java + Swing GUI + MySQL + JDBC)*

A desktop-based Student Management System built using **Java**, **Swing GUI**, and **MySQL**, featuring CRUD operations, search, sort, and an interactive interface.

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
- [Configure JDBC Connection](#-configure-jdbc-connection)
- [Run the Project](#-run-the-project)
- [Tech Stack](#-tech-stack)
- [Future Enhancements](#-future-enhancements)
- [Author](#-author)

---

## 📋 Project Overview

This Student Management System is built using **Java Swing** for UI and **MySQL** for backend data storage.  
Features include adding students, modifying data, searching, sorting, displaying in tables, and simple database connectivity with JDBC.

---

## 🚀 Features

### 🎓 Student Operations
- Add Students  
- Modify Records  
- Search by:
  - Student ID  
  - Last Name  
  - Major  
- Sort by:
  - First Name  
  - Last Name  
  - Major  

### 🖥 GUI
- Built using Java Swing  
- JTable to display data  

### 🗄 Backend
- MySQL Relational Database  
- JDBC for connection  

---

## 🧱 Project Architecture

```txt
Student-Management-System/
│
├── src/
│   ├── AppGUI.java
│   ├── dbConnect.java
│   ├── Table.java
│   └── Main.java
│
├── lib/
│   └── mysql-connector-j-9.5.0.jar
│
├── student_data.sql
├── .gitignore
└── README.md
```

## 📥 Clone the Repository
```bash
git clone https://github.com/Sheelam-Sunnyth/Student-Management-System-Java.git
```
```bash
cd Student-Management-System-Java
```

## 🗄 Database Setup

Create the MySQL database:
``` bash
CREATE DATABASE studentdb;
USE studentdb;
```
Import the student_data.sql file using MySQL Workbench.
This creates the "sdata" table along with sample data.

## 🔌 Configure JDBC Connection

Open dbConnect.java and update connection details:
```bash
String url = "jdbc:mysql://localhost:3306/studentdb?useSSL=false&serverTimezone=UTC";
String user = "root";
String pass = "1236"; (change this to your MySQL password)
```

## 🏃 Run the Project

- Using VS Code:
   - Open the project folder
   - Open Main.java
   - Click Run

- Using Terminal (Windows):

Compile:
```bash
javac -d bin -cp "lib/" src/.java
```
Run:
```bash
java -cp "bin;lib/*" Main
```

## 🛠 Tech Stack

- Programming Language: Java
- GUI Framework: Swing
- Database: MySQL
- Connectivity: JDBC
- IDE: VS Code

## 🔮 Future Enhancements

- Improved UI (GridBagLayout or JavaFX)
- Login & Authentication
- Pagination
- Export to CSV/Excel
- Dark Mode
- REST API version

## ✨ Author

- Sunnyth Sheelam
- Hyderabad, India
- AIML Student
- GitHub: Sheelam-Sunnyth