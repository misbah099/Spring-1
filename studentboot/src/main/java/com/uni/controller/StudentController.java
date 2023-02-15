package com.uni.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.uni.dto.StudentRequestDto;
import com.uni.entity.Student;
import com.uni.service.StudentService;

@RestController
public class StudentController {
@Autowired
	private StudentService studentService;
//get all student
@GetMapping("/students")
public List<Student> getCAllStudents(){
	return studentService.getAllStudent();
}
//get a student by id
@GetMapping("/students/{id}")
public Student getCAStudent(@PathVariable long id) {
	return studentService.getAStudent(id);
}
//get a student by name
@GetMapping("/studentsByName")
public Student getCAStudentByName(@RequestParam String name) {
	return studentService.getStudentByName(name);
}
//get all student by Jpql
@GetMapping("/studentsByJPQL")
public List<Student> getCAStudentByName() {
	return studentService.getAllStudents_ByJPQL();
}
//get a student by Email
@GetMapping("/studentsByEmail")
public Student getCAStudentByEmail(@RequestParam String email) {
	return studentService.getStudentByEmail(email);
}
//create a student
	@PostMapping(path = "/students")
	public ResponseEntity<Student> createStudent(@RequestBody @Valid StudentRequestDto studentRequest) {
		return new ResponseEntity<>(studentService.createStudent(studentRequest), HttpStatus.CREATED);
	}

//update the student
@PutMapping("/students/{id}")
public Student updateCStudent(@PathVariable long id,@RequestBody Student student) {
	return studentService.updateAStudent(student, id);
}
//delete an existing student
	@DeleteMapping("/students/{id}")
	public String deleteCStudent(@PathVariable long id) {
		return studentService.delete(id);
	}
}
