<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生管理</title>
    <style>
        table { border-collapse: collapse; width: 80%; margin: 20px auto; }
        th, td { border: 1px solid #ddd; padding: 12px; text-align: center; }
        th { background-color: #4CAF50; color: white; }
        tr:nth-child(even) { background-color: #f2f2f2; }
        .btn { padding: 5px 15px; margin: 0 5px; text-decoration: none; color: white; border-radius: 3px; display: inline-block; }
        .edit { background-color: #2196F3; }
        .delete { background-color: #f44336; }
        .add { background-color: #4CAF50; }
        h2 { text-align: center; }
        .center { text-align: center; margin: 20px; }
    </style>
</head>
<body>
    <h2>学生管理系统</h2>
    <div class="center">
        <a href="/students/add" class="btn add">新增学生</a>
    </div>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>性别</th>
                <th>课程</th>
                <th>操作</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.studentId}</td>
                    <td>${student.studentName}</td>
                    <td>${student.studentAge}</td>
                    <td>${student.studentGender}</td>
                    <td>${student.studentCourse}</td>
                    <td>
                        <a href="/students/edit/${student.studentId}" class="btn edit">Edit</a>
                        <a href="/students/delete/${student.studentId}" class="btn delete"
                           onclick="return confirm('确定删除吗？')">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
