package com.example.mouri.townvo;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
	private Long studentId;
	private String studentName;
	private String studentCourse;
}
