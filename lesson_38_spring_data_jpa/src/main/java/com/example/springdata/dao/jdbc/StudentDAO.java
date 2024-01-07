package com.example.springdata.dao.jdbc;

import com.example.springdata.dto.Student;
import com.example.springdata.mapper.StudentMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

//    @Transactional(propagation = Propagation.MANDATORY, isolation = Isolation.READ_UNCOMMITTED)
    @Transactional
    public void commit(boolean isThrowException) {
        jdbcTemplate.update(
                "DELETE FROM students WHERE id=1");

        if (isThrowException) {
            throw new RuntimeException("Error DB");
        }

        jdbcTemplate.update(
                "INSERT INTO students (id, name, phone_number) VALUES (?, ?, ?)", 1, "Bill", "123");

    }

    public void add() {
        jdbcTemplate.update(
                "INSERT INTO students (id, name, phone_number) VALUES (?, ?, ?)", 1, "Bill", "123");
    }

    public void getAll() {
        final List<Student> students =
                jdbcTemplate.query("SELECT * FROM students", new BeanPropertyRowMapper<>(Student.class));

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void get(int id) {
        String query = "SELECT * FROM students WHERE id = ?";
        Student student = jdbcTemplate.queryForObject(query, new StudentMapper(), id);
        System.out.println(student);
    }

    public void get1(){
        SqlParameterSource namedParameters = new MapSqlParameterSource().addValue("id", 1);
        final Student student =
                namedParameterJdbcTemplate.queryForObject("SELECT * FROM students WHERE id = :id", namedParameters,
                        Student.class);
        System.out.println(student);
    }
}
