package edu.hillel.springhilllel;

import edu.hillel.springhilllel.model.Student;
import edu.hillel.springhilllel.service.OtherService;
import edu.hillel.springhilllel.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringHilllelApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringHilllelApplication.class, args);
        final StudentService studentService = applicationContext.getBean(StudentService.class);
        studentService.addStudent(new Student(1, "test"));

        final OtherService otherService = applicationContext.getBean(OtherService.class);
        otherService.printAllStudents();
    }
}
