package org.company;

import org.company.entity.Course;
import org.company.entity.Student;

import java.util.List;

public class CourseMain {
    public static void main(String[] args) {

        CourseDao courseDao = new CourseDao();

        // ── Test 1: Single course with instructor + students ──
        System.out.println("===== Test 1: Course with Instructor + Students =====");
        Course course = courseDao.getCourseWithInstructor(1);
        System.out.println("Course     : " + course.getCourseName());
        System.out.println("Instructor : " + course.getInstructor().getInstructorName());
        System.out.println("Email      : " + course.getInstructor().getInstructorMail());
        System.out.println("Students enrolled:");
        for (Student s : course.getStudents()) {
            System.out.println("   - " + s.getStudentName() + " | Age: " + s.getStudentAge());
        }

        // ── Test 2: All courses with instructors + students ──
        System.out.println("\n===== Test 2: All Courses =====");
        List<Course> allCourses = courseDao.getAllCoursesWithInstructor();
        for (Course c : allCourses) {
            System.out.println("\nCourse     : " + c.getCourseName());
            System.out.println("Instructor : " + c.getInstructor().getInstructorName());
            System.out.println("Students   : " + c.getStudents().size() + " enrolled");
            for (Student s : c.getStudents()) {
                System.out.println("   - " + s.getStudentName() + " | Age: " + s.getStudentAge());
            }
        }
    }
}
