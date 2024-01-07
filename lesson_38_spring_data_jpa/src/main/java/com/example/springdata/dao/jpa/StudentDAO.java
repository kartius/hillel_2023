package com.example.springdata.dao.jpa;

import com.example.springdata.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface StudentDAO extends JpaRepository<Student, Integer> {

    @Query(value = "SELECT * FROM students AS s", nativeQuery = true)
    List<Student> getAllStudents();

//    @Query("SELECT s FROM students AS s WHERE s.id=:id")
//    Student getStudentById(int id);

//    Student getStudentById(int id);

    Student getHillelSchoolStudentById(int id);

    Student getHillelSchoolStudentByIdAndNameAndPhoneNumberContains(int id, String name, String phoneNumber);

    List<Student> getStudentById(int id);

}
