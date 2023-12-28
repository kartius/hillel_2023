package com.example.springdatahillel.dao;

import com.example.springdatahillel.dto.Student;
import com.example.springdatahillel.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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

    private final JdbcTemplate jdbcTemplate;

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public StudentDAO(JdbcTemplate jdbcTemplate, NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public void add() {
        jdbcTemplate.update("INSERT INTO students (id, name, phone_number) VALUES (?,?,?)", 2, "ttt", "123");
    }


    public Student get(int id) {
        String query = "SELECT * FROM students WHERE id=?";
        return jdbcTemplate.queryForObject(query, new StudentMapper(), id);
    }

    public List<Student> getAll() {
        String query = "SELECT * FROM students";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Student.class));
    }

    public void namedGet() {
        SqlParameterSource namedParameters = new MapSqlParameterSource()
                .addValue("id", 1)
                .addValue("name", "test")
                .addValue("phone_number", "123");

        namedParameterJdbcTemplate.queryForObject("SELECT * FROM students WHERE id= :id", namedParameters, Student.class);
    }


    @Transactional(propagation = Propagation.MANDATORY, isolation = Isolation.READ_COMMITTED)
    public void commit(boolean isThrowException) {
        jdbcTemplate.update("DELETE FROM students WHERE id=2");
        if (isThrowException) {
            throw new RuntimeException("Error DB");
        }
        jdbcTemplate.update(
                "INSERT INTO students (id, name, phone_number) VALUES (?, ?, ?)", 2, "Bill", "123");

    new AccountDAO().get();

    }


}
