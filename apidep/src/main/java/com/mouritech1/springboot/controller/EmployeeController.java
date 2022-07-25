package com.mouritech1.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech1.springboot.dto.EmployeeDto;
import com.mouritech1.springboot.service.EmployeeService;

@RestController
@RequestMapping("/empl")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<EmployeeDto> saveEmploye(@RequestBody EmployeeDto employeeDto) {
		EmployeeDto dto = employeeService.save(employeeDto);
		return new ResponseEntity<EmployeeDto>(dto, HttpStatus.CREATED);
	}

	@GetMapping(value = "/department")
	public ResponseEntity<List<EmployeeDto>> getAllEmployeeByDepartmentId(
			@RequestParam(value = "depId", required = true) Integer deptId) {
		List<EmployeeDto> data = employeeService.getAllEmployeBydeptId(deptId);
		return new ResponseEntity<>(data, HttpStatus.OK);

	}

}
