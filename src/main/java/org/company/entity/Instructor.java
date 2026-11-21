package org.company.entity;

public class Instructor {
    private int instructorId;
    private String instructorName;
    private String instructorMail;

    public Instructor() {
    }

    public Instructor(int instructorId, String instructorName, String instructorMail) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorMail = instructorMail;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorMail() {
        return instructorMail;
    }

    public void setInstructorMail(String instructorMail) {
        this.instructorMail = instructorMail;
    }

    @Override
    public String toString() {
        return "Instructor [instructorId=" + instructorId + ", instructorName=" + instructorName + ", instructorMail=" + instructorMail + "]";
    }
}
