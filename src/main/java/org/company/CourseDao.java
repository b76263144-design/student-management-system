package org.company;

import org.apache.ibatis.session.SqlSession;
import org.company.entity.Course;

import java.util.List;

public class CourseDao {

    public Course getCourseWithInstructor(int courseId) {
        SqlSession session = mybatisutil.openSession();
        try {
            return session.selectOne("org.company.CourseMapper.getCourseWithInstructor", courseId);
        } finally {
            session.close();
        }
    }

    public List<Course> getAllCoursesWithInstructor() {
        SqlSession session = mybatisutil.openSession();
        try {
            return session.selectList("org.company.CourseMapper.getAllCoursesWithInstructor");
        } finally {
            session.close();
        }
    }
}

