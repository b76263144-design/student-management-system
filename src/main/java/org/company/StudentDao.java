package org.company;

import org.apache.ibatis.session.SqlSession;
import org.company.entity.Student;

import java.util.List;

public class StudentDao {
    public Student getStudentById(int studentId) {
        SqlSession session = mybatisutil.openSession();
        try {
            return session.selectOne("org.company.StudentMapper.getStudentById", studentId);
        } finally {
            session.close();
        }
    }

    public int insertStudent(Student student) {
        SqlSession session = mybatisutil.openSession();
        try {
            int rows = session.insert("org.company.StudentMapper.addStudent", student);
            session.commit();
            return rows;
        } finally {
            session.close();
        }
    }

    public List<Student> getAllStudents() {
        SqlSession session = mybatisutil.openSession();
        try {
            return session.selectList("org.company.StudentMapper.getAllStudents");
        } finally {
            session.close();
        }
    }

    public void deleteStudent(int id) {
        SqlSession session = mybatisutil.openSession();
        try {
            session.delete("org.company.StudentMapper.deleteStudent", id);
            session.commit();
        } finally {
            session.close();
        }
    }

    public void updateStudent(Student student) {
        SqlSession session = mybatisutil.openSession();
        try {
            session.update("org.company.StudentMapper.updateStudent", student);
            session.commit();
        } finally {
            session.close();
        }
    }
}
