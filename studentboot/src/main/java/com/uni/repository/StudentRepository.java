package com.uni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.uni.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
 Student findByName(String name); 
 Student findByEmail(String email);
 //JPQL
 @Query("select s from Student s")
 List<Student> findAll();
}
