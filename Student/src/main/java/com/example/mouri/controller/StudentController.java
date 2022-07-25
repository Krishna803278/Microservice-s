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

import com.example.mouri.entity.Student;

import com.example.mouri.service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	//http://localhost:9999/api/student/
	@PostMapping
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		return new ResponseEntity<Student>(service.saveStudent(student),HttpStatus.CREATED);
	}
	
	//http://localhost:9999/api/student/
	@GetMapping
	public List<Student>getAllStudent()	{
		return service.getAllStudent();
		
	}
		
	//http://localhost:9999/api/student/4
	@GetMapping("{idd}")	
	public ResponseEntity<Student> getVillageById(@PathVariable ("idd") long id) {
		
		return ResponseEntity.ok(service.getStudentById(id));
	}
	
	//http://localhost:9999/api/student/4
	@PutMapping("{idd}")
	public ResponseEntity<Student> updatedetails(@PathVariable("idd") long id, @RequestBody Student student) {
		Student UpdateStudentValue = service.updateStudent(student, id);
		return new ResponseEntity<Student>(UpdateStudentValue, HttpStatus.OK);

	}
	
	//http://localhost:9999/api/student/4
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteValue(@PathVariable("id") long id) {
                    service.deleteStudent(id);
		return new ResponseEntity<String>("Student Details Successfully Deleted", HttpStatus.OK);
	}



}
