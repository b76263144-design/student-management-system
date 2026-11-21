package org.company.entity;

import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private Instructor instructor;
    private List<Student> students;

    public Course() {
    }

    public Course(int courseId, String courseName, Instructor instructor, List<Student> students) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = students;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseName=" + courseName + ", instructor=" + instructor + ", students=" + students + "]";
    }
}
