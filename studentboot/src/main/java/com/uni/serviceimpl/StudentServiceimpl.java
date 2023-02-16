package com.uni.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uni.dto.StudentRequestDto;
import com.uni.entity.Student;
import com.uni.repository.StudentRepository;
import com.uni.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService {
	@Autowired
private StudentRepository studentRepository;
	
/*
 * public StudentServiceimpl(StudentRepository studentRepository) { super();
 * this.studentRepository = studentRepository; }
 */
	@Override
	public Student createStudent(StudentRequestDto studentRequest) {

		Student student = Student.builder().name(studentRequest.getName()).address(studentRequest.getAddress())
				.email(studentRequest.getEmail()).mobileno(studentRequest.getMobile()).build();
		return studentRepository.save(student);
	}
	
	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getAStudent(long id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get() ;
	}

	@Override
	public Student updateAStudent(Student student, long id) {
		// TODO Auto-generated method stub
		Student _student=studentRepository.findById(id).get() ;
		_student.setName(student.getName());
		_student.setName(student.getEmail());
		_student.setName(student.getAddress());
		_student.setMobileno(student.getMobileno());

		return studentRepository.save(_student);
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
		return "The student with id:"+id+" has been Deleted";
	}

	@Override
	public Student getStudentByName(String name) {
		// TODO Auto-generated method stub
		return studentRepository.findByName(name);
	}

	@Override
	public Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub
		return studentRepository.findByEmail(email);
	}

	@Override
	public List<Student> getAllStudents_ByJPQL() {
		// TODO Auto-generated method stub
		return studentRepository.findAll() ;
	}

}
