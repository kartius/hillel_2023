package edu.hillel.springhilllel.config;

import edu.hillel.springhilllel.service.OtherService;
import edu.hillel.springhilllel.service.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigApp {

    @Value("${app.my.value}")
    private String value;

    public String getValue() {
        return value;
    }

    @Bean
    @Scope("prototype")
    public StudentService studentService() {
        return new StudentService();
    }

    @Bean
    public OtherService otherService(StudentService studentService) {
        return new OtherService(studentService);
    }
}
