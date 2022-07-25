package com.mouritech1.springboot.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import com.mouritech1.springboot.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class DepartmentDto {
	
	private Long deptId;
	private String deptName;
	private String deptLocation;

	
}
