package com.mouritech.springboot.payload;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
	private long stuId;
	private String stuName;
	private String StuRoleNumber;
	private String StuNumber;

}
