# Student Management System / 学生信息管理系统

基于 Java Web 的学生信息管理系统，Servlet + JSP + Spring MVC + MyBatis + MySQL 技术栈，覆盖学生、课程、班级、教师等实体的增删改查与分页查询。

A Java Web student information system built with Servlet, JSP, Spring MVC, MyBatis and MySQL, providing CRUD and paginated queries for students, courses, classes and instructors.

## 技术栈 / Tech stack

| 层 | 技术 |
| --- | --- |
| Web 层 | Servlet, JSP, Spring MVC, Jetty |
| 持久层 | MyBatis, JDBC |
| 数据库 | MySQL |
| 构建 | Maven |

## 功能 / Features

- 学生信息的增删改查与分页列表
- 课程、班级、教师信息管理
- 基于 MyBatis 的 SQL 映射与类型处理器（GenderTypeHandler）
- JSP 视图（student-list / student-edit）

## 运行前准备 / Getting started

1. 安装 JDK 8+ 与 MySQL，创建数据库。
2. 复制配置模板并填入你自己的数据库连接信息：

   ```bash
   cp src/main/resources/db.properties.example src/main/resources/db.properties
   # 编辑 db.properties，填写 url / user / pass
   ```

3. 用 Maven 构建并在 Jetty 上运行（项目内置 `JettyServer.java`），或在 IDE 中部署到 Servlet 容器。

> 注意：`db.properties` 含数据库密码，已加入 `.gitignore`，请勿提交真实凭据。

## 关于来源 / Attribution

> 本项目代码基于开源社区的学生管理系统示例学习、运行与整理而来，用于个人学习与作品展示。此处如实标注来源，不声称原始代码的原创著作权归属本人；本人的工作集中在环境配置、数据库调试、功能理解与文档整理。

This project is based on an open-source student management system example, studied and re-organized for learning and portfolio purposes. Credit for the original code belongs to its original authors.
