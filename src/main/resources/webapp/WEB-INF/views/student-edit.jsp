<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑学生</title>
    <style>
        form { width: 400px; margin: 50px auto; padding: 20px; border: 1px solid #ddd; border-radius: 5px; }
        label { display: block; margin: 10px 0 5px; font-weight: bold; }
        input, select { width: 100%; padding: 8px; margin-bottom: 10px; box-sizing: border-box; }
        button { background-color: #4CAF50; color: white; padding: 10px 20px; border: none; cursor: pointer; width: 100%; border-radius: 3px; }
        h2 { text-align: center; }
    </style>
</head>
<body>
    <h2>${student.studentId == 0 ? '新增学生' : '编辑学生'}</h2>
    <form action="${student.studentId == 0 ? '/students/add' : '/students/update'}" method="post">
        <input type="hidden" name="studentId" value="${student.studentId}"/>
        <label>姓名：</label>
        <input type="text" name="studentName" value="${student.studentName}" required/>
        <label>年龄：</label>
        <input type="number" name="studentAge" value="${student.studentAge}" required/>
        <label>性别：</label>
        <select name="studentGender">
            <option value="MALE" ${student.studentGender == 'MALE' ? 'selected' : ''}>男</option>
            <option value="FEMALE" ${student.studentGender == 'FEMALE' ? 'selected' : ''}>女</option>
        </select>
        <label>课程：</label>
        <input type="text" name="studentCourse" value="${student.studentCourse}" required/>
        <button type="submit">保存</button>
    </form>
</body>
</html>
