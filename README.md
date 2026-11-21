# Student Management System

A Java Web student information system built with Servlet, JSP, Spring MVC, MyBatis, and MySQL, providing CRUD operations and paginated queries for students, courses, classes, and instructors.

## Tech Stack

| Layer | Technologies |
| --- | --- |
| Web | Servlet, JSP, Spring MVC, Jetty |
| Persistence | MyBatis, JDBC |
| Database | MySQL |
| Build | Maven |

## Features

- CRUD and paginated listing of student records
- Management of courses, classes, and instructors
- MyBatis SQL mapping with a custom type handler (`GenderTypeHandler`)
- JSP views (student-list / student-edit)

## Getting Started

1. Install JDK 8+ and MySQL, then create a database.
2. Copy the configuration template and fill in your own database credentials:

   ```bash
   cp src/main/resources/db.properties.example src/main/resources/db.properties
   # edit db.properties and set url / user / pass
   ```

3. Build with Maven and run on Jetty (the project includes `JettyServer.java`), or deploy to a Servlet container from your IDE.

> Note: `db.properties` contains a database password and is listed in `.gitignore`. Do not commit real credentials.

## Attribution

> This project is based on an open-source student management system example from the community, studied, run, and re-organized for personal learning and portfolio purposes. The source is credited here honestly; no original copyright is claimed over the upstream code. My own work focused on environment setup, database debugging, feature comprehension, and documentation.
