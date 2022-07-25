package com.mouritech.springboot.payload;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
@AllArgsConstructor
public class TeacherDto {
	private long tcrId;
	private String tcrName;
	
	

}
