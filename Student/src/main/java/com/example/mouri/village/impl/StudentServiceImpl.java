package com.example.mouri.village.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mouri.entity.Student;

import com.example.mouri.exception.StudentException;
import com.example.mouri.repository.StudentRepository;
import com.example.mouri.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository  studentRepository;

	@Override
	public Student saveStudent(Student student) {

		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub;
		return studentRepository.findById(id).orElseThrow(() -> new StudentException("ID", "id", id));
	}

	@Override
	public Student updateStudent(Student student, Long id) {

		Student student2 = studentRepository.findById(id).orElseThrow(() -> new StudentException("ID", "id", id));

//		village2.setVillageId(village.getVillageId());
		student2.setStudentName(student.getStudentName());
		student2.setStudentCourse(student.getStudentCourse());
		Student updateStudent = studentRepository.save(student2);

		return updateStudent;
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.findById(id).orElseThrow(() -> new StudentException("ID", "id", id));
		studentRepository.deleteById(id);

	}

}
