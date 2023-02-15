package com.uni.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.uni.dto.StudentRequestDto;
import com.uni.entity.Student;

@Component
public interface StudentService {
Student createStudent(StudentRequestDto studentRequest);
List<Student>getAllStudent();
Student getAStudent(long id);
Student updateAStudent (Student student,long id);
String delete (long id);
Student getStudentByName(String name);
Student getStudentByEmail(String email);
List<Student> getAllStudents_ByJPQL();
}
