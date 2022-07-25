package com.mouritech1.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech1.springboot.dto.DepartmentDto;
import com.mouritech1.springboot.service.DepartmentService;

@RestController
@RequestMapping("/dep")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	public ResponseEntity<DepartmentDto> saveDepartmente(@RequestBody DepartmentDto departmentDto) {
		DepartmentDto dto = departmentService.save(departmentDto);
		return new ResponseEntity<DepartmentDto>(dto, HttpStatus.CREATED);
	}

}
