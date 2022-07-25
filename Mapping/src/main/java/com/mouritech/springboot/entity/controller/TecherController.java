package com.mouritech.springboot.entity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.springboot.payload.StudentDto;
import com.mouritech.springboot.payload.TeacherDto;
import com.mouritech.springboot.service.TeacherService;

@RestController
@RequestMapping("/techer")
public class TecherController {
	@Autowired
	private TeacherService teacherService;

	public ResponseEntity<TeacherDto> saveTeacher(@RequestBody TeacherDto teacherDto) {

		TeacherDto data = teacherService.savetecher(teacherDto);
		return new ResponseEntity<TeacherDto>(data, HttpStatus.CREATED);

	}
}
