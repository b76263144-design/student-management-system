package org.company.entity;

import java.io.Serializable;

public class Student implements Serializable{
    private int studentId;
    private String studentName;
    private String studentDistrict;
    private String studentCourse;
    private Gender studentGender;
    private int studentAge;

    public Student() {
    }

    public Student(int studentId, String studentName, String studentDistrict, String studentCourse, Gender studentGender, int studentAge) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDistrict = studentDistrict;
        this.studentCourse = studentCourse;
        this.studentGender = studentGender;
        this.studentAge = studentAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDistrict() {
        return studentDistrict;
    }

    public void setStudentDistrict(String studentDistrict) {
        this.studentDistrict = studentDistrict;
    }

    public String getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(String studentCourse) {
        this.studentCourse = studentCourse;
    }

    public Gender getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(Gender studentGender) {
        this.studentGender = studentGender;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentDistrict='" + studentDistrict + '\'' +
                ", studentCourse='" + studentCourse + '\'' +
                ", studentGender=" + studentGender +
                ", studentAge=" + studentAge +
                '}';
    }
}
