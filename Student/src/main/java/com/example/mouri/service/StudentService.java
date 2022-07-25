package com.example.mouri.service;

import java.util.List;

import com.example.mouri.entity.Student;

public interface StudentService {
	
	Student saveStudent(Student student);	
	
	List<Student> getAllStudent();
	
	Student getStudentById(Long id);

	Student updateStudent(Student student, Long id);

	void deleteStudent(Long id);
	
	
}
