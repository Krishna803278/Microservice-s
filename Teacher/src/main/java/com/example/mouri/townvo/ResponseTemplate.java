package com.example.mouri.townvo;

import javax.persistence.Entity;

import com.example.mouri.entity.Teacher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ResponseTemplate {

	private Teacher teacher;
	private Student student;
}
