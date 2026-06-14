# PTC Booking System

[![Java Version](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![Build Tool](https://img.shields.io/badge/Build-Maven-blue.svg)](https://maven.apache.org/)
[![Database](https://img.shields.io/badge/Database-SQL-lightgrey.svg)](https://www.sqlite.org/index.html)
[![Development Branch](https://img.shields.io/badge/Branch-Funtionality-orange.svg)](https://github.com/IoannisCh/PTCBookingSystem/tree/Funtionality)

A desktop-based booking and management application built using Java and managed via Maven. Integrated with a relational SQL backend, the system is engineered to handle administrative workflows, resource booking constraints, and data persistence safely. The codebase showcases strong object-oriented programming (OOP) principles, clean data abstraction, and modular application architecture.

> 🛠️ **Note on Current Branch:** This documentation details the active development and feature implementation residing within the `Funtionality` branch.

---

## ✨ Key Features

- **Automated Booking Engine:** Full CRUD (Create, Read, Update, Delete) lifecycle implementation for client scheduling and resource logging.
- **Relational SQL Database Layer:** Structured data persistence handling core business details via Java Database Connectivity (JDBC).
- **Business Rule Verification:** Built-in validation constraints preventing booking conflicts and maintaining relational data integrity.
- **Desktop Graphical Interface:** An intuitive administrative desktop view layout optimized for swift system interactions.
- **Automated Lifecycle Management:** Built and managed via Maven for seamless, production-ready dependency resolution and build stability.

---

## 🏗️ Project Architecture & Domain Structure

The codebase utilizes a standard Maven layout, isolating source logic into a cohesive singular package layer and directing compiled build output to a dedicated target space:

PTCBookingSystem/
├── src/
│   └── main/
│       └── java/
│           └── ptcmanagement_system/
│               ├── Attending.java                
│               ├── Book.java                 
│               ├── ListNodes.java       
│               ├── Lists.java
│               ├── Ptc.java
│               ├── Review.java
│               ├── Student.java
│               ├── TestListString.java
├── target/                                  
     └── classes/
         └── ptcmanagement_system/
│               ├── ListNodes.class
│               ├── Lists.class
│               ├── Ptc.class
│               ├── Student.class
│               ├── TestListString.class
      └── maven-status/
                └── maven-compiler-plugin/
                            └── maven-status/
                                ├── creatdFiles.lst
                                ├── inputFiles.lst
                            
├── LICENSE
├── pom.xml                                  # Maven Project Object Model (Dependencies & Lifecycle)
└── README.md                                # Project documentation

### How it started
Lesson Management System for PTC

This was the official repository for the library management system created for the needs of
module 6WCM0027 for the academic year 2021/2022 semester B for the UH.

The project after been compiled should generate a GUI for the Lesson Management System.

The GUI is hard coded, there is no use of any framework.

UPDATE:
After 01/04/2026, the project changed course to be brought up to date, and progress to a modern approach. 
There are massive changes since the original system.

# 🚀 Ongoing Roadmap
[ ] Implement multi-table indexing to optimize rapid search query performance.

[ ] Add explicit exceptional state catching to gracefully isolate local database I/O hiccups.

[ ] Incorporate comprehensive JUnit 5 test suites hooked into the Maven mvn test phase to safeguard critical verification functions during updates.

[ ] Support data extraction filters allowing administration records to be written safely to .csv formats.

# 📄 License
This project is open-source. Please check code headers or repository tags for explicit terms.

# ✉️ Contact
Ioannis Chantolios - GitHub Profile
