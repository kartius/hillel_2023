package com.example.springdatahillel;

import com.example.springdatahillel.dao.StudentDAO;
import com.example.springdatahillel.dto.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDataHillelApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(SpringDataHillelApplication.class, args);
        final StudentDAO studentDAO = context.getBean(StudentDAO.class);
//        System.out.println(studentDAO.get(1));


//        for (Student student : studentDAO.getAll()) {
//            System.out.println(student);
//        }

        studentDAO.commit(false);
    }

}
