package com.uni;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uni.entity.Student;
import com.uni.repository.StudentRepository;

@SpringBootApplication
public class StudentbootApplication implements CommandLineRunner {
@Autowired
private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(StudentbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student s1=Student.builder().name("Misbah").email("m@gmail.com").address("Asansol").mobileno(7039383893l).build();
		Student s2=Student.builder().name("Nisha").email("n@gmail.com").address("Ondal").mobileno(678083893l).build();
		Student s3=Student.builder().name("Soumyo").email("s@gmail.com").address("Durgapur").mobileno(9092383893l).build();
		Student s4=Student.builder().name("Atif").email("a@gmail.com").address("Shilong").mobileno(789083893l).build();
		Student s5=Student.builder().name("Akshay").email("Ak@gmail.com").address("Raurkila").mobileno(987083893l).build();
		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
		studentRepository.save(s4);
		studentRepository.save(s5);
System.out.println("--------------------all are save--------------------");

	}

}
