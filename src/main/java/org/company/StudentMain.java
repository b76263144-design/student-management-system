package org.company;

import org.company.entity.Student;

public class StudentMain {
    public static void main(String[] args) {
        try {
            System.out.println("=== MyBatis Demo Started ===");

            // Create DAO and test query
            StudentDao studentDao = new StudentDao();
            Student student = studentDao.getStudentById(1);

            if (student != null) {
                System.out.println("Student found: " + student.toString());
            } else {
                System.out.println("Student not found!");
            }

            System.out.println("=== MyBatis Demo Finished ===");
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
