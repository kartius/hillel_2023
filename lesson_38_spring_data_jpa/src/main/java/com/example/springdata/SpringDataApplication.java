package com.example.springdata;

import com.example.springdata.dao.jpa.StudentDAO;
import com.example.springdata.dto.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Set;

@SpringBootApplication
public class SpringDataApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringDataApplication.class, args);
        final StudentDAO studentDAO = applicationContext.getBean(StudentDAO.class);
        for (Student student : studentDAO.findAll()) {
            System.out.println(student);
        }

        System.out.println("------------------------------------");

        for (Student student : studentDAO.getAllStudents()) {
            System.out.println(student);
        }

        System.out.println("------------------------------------");

        System.out.println(studentDAO.getStudentById(2));


        System.out.println("------------------------------------");

        System.out.println(studentDAO.getHillelSchoolStudentById(3));


        System.out.println("------------------------------------");

        System.out.println(studentDAO.getHillelSchoolStudentByIdAndNameAndPhoneNumberContains(5,"Ivan","6"));

        final Pageable pageRequest = PageRequest.of(0, 2, Sort.by("name").descending());

        System.out.println("------------------------------------");

        for (Student student : studentDAO.findAll(pageRequest)) {
            System.out.println(student);
        }


        System.out.println("------------------------------------");

        for (Student student : studentDAO.findAll(Sort.by("id").descending())) {
            System.out.println(student);
        }


        studentDAO.getStudentById(1);



//        studentDAO.add();
//        studentDAO.commit(true);
//        studentDAO.get(1);
//        studentDAO.getAll();
//        studentDAO.get1();

    }

}
