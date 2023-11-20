package edu.hillel.springhilllel.service;

import edu.hillel.springhilllel.config.ConfigApp;
import org.springframework.beans.factory.annotation.Autowired;



public class OtherService {

    @Autowired
    private ConfigApp configApp;


    private final StudentService studentService;

    public OtherService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void printAllStudents() {
        System.out.println(studentService.getStudents());
        System.out.println(configApp.getValue());
    }
}
