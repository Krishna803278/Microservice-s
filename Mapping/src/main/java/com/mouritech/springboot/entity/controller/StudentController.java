package com.mouritech.springboot.entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.springboot.payload.StudentDto;
import com.mouritech.springboot.payload.TeacherDto;
import com.mouritech.springboot.service.StudentService;
import com.mouritech.springboot.service.TeacherService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	public StudentService studentService;
	public ResponseEntity<StudentDto> saveTeacher(@RequestBody StudentDto studentDto) {

		StudentDto data = studentService.saveStudent(studentDto);
		return new ResponseEntity<StudentDto>(data, HttpStatus.CREATED);

	}
}
