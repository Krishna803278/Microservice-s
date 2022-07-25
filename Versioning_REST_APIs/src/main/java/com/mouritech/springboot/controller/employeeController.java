package com.mouritech.springboot.controller;


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

import com.mouritech.springboot.payload.EmployeeDto;
import com.mouritech.springboot.service.EmployeServiceImpl;
@RestController
@RequestMapping("/employe")
public class employeeController {
	@Autowired
	private EmployeServiceImpl employeServiceImpl;
	
	@PostMapping
	public ResponseEntity<EmployeeDto> createEmploye(@RequestBody EmployeeDto employeeDTO) {
		return new ResponseEntity<EmployeeDto>(employeServiceImpl.createEmploye(employeeDTO), HttpStatus.CREATED);
		
	}

	@GetMapping
	public List<EmployeeDto> getAllEmployee (){
		return employeServiceImpl.fetchAllEmloyee();
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeDto> getByEmployeeId(@PathVariable("id") long id) {
		return new ResponseEntity<EmployeeDto>(employeServiceImpl.findByEmployeId(id), HttpStatus.OK);
		//return ResponseEntity.ok(employeServiceImpl.findByEmployeId(id);

	}

	@PutMapping("/{id}")
	public ResponseEntity<EmployeeDto> upDateEmployeId( @RequestBody EmployeeDto employeeDTO,@PathVariable("id") long id) {
		 EmployeeDto  employeeDto2 = employeServiceImpl.upDateEmployeDetails(id, employeeDTO);
		return new ResponseEntity<EmployeeDto>(employeeDto2, HttpStatus.OK);

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployeById(@PathVariable("id") long id) {
		employeServiceImpl.deleteEmployeeById(id);
		return new ResponseEntity<String>("sds", HttpStatus.OK );

	}

	

}
