package org.company.Controller;

import org.company.StudentDao;
import org.company.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentDao studentDao = new StudentDao();

    @GetMapping
    public String listStudents(Model model) {
        List<Student> students = studentDao.getAllStudents();
        model.addAttribute("students", students);
        return "student-list";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable int id, Model model) {
        Student student = studentDao.getStudentById(id);
        model.addAttribute("student", student);
        return "student-edit";
    }

    @PostMapping("/update")
    public String updateStudent(Student student) {
        studentDao.updateStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentDao.deleteStudent(id);
        return "redirect:/students";
    }

    @GetMapping("/add")
    public String addStudentPage(Model model) {
        model.addAttribute("student", new Student());
        return "student-edit";
    }

    @PostMapping("/add")
    public String addStudent(Student student) {
        studentDao.insertStudent(student);
        return "redirect:/students";
    }
}
