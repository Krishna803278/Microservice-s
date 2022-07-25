package com.example.mouri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mouri.entity.Teacher;
import com.example.mouri.service.TeacherService;
import com.example.mouri.townvo.ResponseTemplate;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService service;

	//http://localhost:9999/api/town/
	@PostMapping
	public ResponseEntity<Teacher> saveTeacher(@RequestBody Teacher teacher) {
		return new ResponseEntity<Teacher>(service.saveTeacher(teacher), HttpStatus.CREATED);
	}
	
	//http://localhost:9999/api/town/
	@GetMapping
	public List<Teacher> getAllTeacher() {
		return service.getAllTeacher();

	}
	
	//http://localhost:9999/api/town/4
	@GetMapping("{idd}")
	public ResponseEntity<Teacher> getTeacherById(@PathVariable("idd") long id) {
		Teacher teacher = service.getTeacherById(id);
		return ResponseEntity.ok(teacher);
	}

	//http://localhost:9999/api/town/4
	@PutMapping("{idd}")
	public ResponseEntity<Teacher> updatedetails(@PathVariable("idd") long id, @RequestBody Teacher teacher) {
		Teacher UpdateTeacherValue = service.updateTeacher(teacher, id);
		return new ResponseEntity<Teacher>(UpdateTeacherValue, HttpStatus.OK);

	}

	//http://localhost:9999/api/town/4
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteValue(@PathVariable("id") long id) {
		service.deleteTeacher(id);
		return new ResponseEntity<String>("Town Details Successfully Deleted", HttpStatus.OK);
	}
	
	@GetMapping("/ts/{tid}")
	public ResponseEntity<ResponseTemplate> getByTeacherWithStudent(@PathVariable("tid") long id) {
		
		return new ResponseEntity<ResponseTemplate> (service.getByTeacherWithStudent(id),HttpStatus.OK);
		
	}

}
