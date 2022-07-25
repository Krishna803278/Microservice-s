package com.mouritech.springboot.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mouritech.springboot.entity.Students;
import com.mouritech.springboot.payload.StudentDto;
import com.mouritech.springboot.repository.StudentRepository;
import com.mouritech.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	public ModelMapper mapper;

	@Override
	public StudentDto saveStudent(StudentDto studentDto) {
		Students students = dtoToEntity(studentDto);
		studentRepository.save(students);

		return entityToDto(students);
		
	}
	

	private Students dtoToEntity(StudentDto studentDto) {
		Students students = mapper.map(studentDto, Students.class);
		return students;
	}

	private StudentDto entityToDto(Students students) {
		StudentDto studentDto = mapper.map(students, StudentDto.class);
		return studentDto;
	}


}
