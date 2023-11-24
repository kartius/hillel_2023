package edu.hillel.springmvc.service;

import edu.hillel.springmvc.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentService {

    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
        throw new RuntimeException("bla");
    }

    public Map<Integer, Student> getAllStudents() {
        return students;
    }

    public Student getStudent(int id) {
        return students.get(id);
    }
}
