package edu.hillel.springmvc.controller;

import edu.hillel.springmvc.model.Student;
import edu.hillel.springmvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getStudents")
    public Map<Integer, Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/getStudentByIdRequest")
    public Student getStudentByIdRequest(@RequestParam int id) {
        return studentService.getStudent(id);
    }

    @GetMapping("/getStudentByIdPath/{id}")
    public Student getStudentByIdPath(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }
}
