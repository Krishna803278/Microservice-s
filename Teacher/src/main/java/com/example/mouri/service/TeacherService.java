package com.example.mouri.service;

import java.util.List;

import com.example.mouri.entity.Teacher;
import com.example.mouri.townvo.ResponseTemplate;

public interface TeacherService {

	Teacher saveTeacher(Teacher teacher );	
	
	List<Teacher> getAllTeacher();
	
	Teacher getTeacherById(Long id);

	Teacher updateTeacher(Teacher teacher, Long id);

	void deleteTeacher(Long id);
	
	ResponseTemplate getByTeacherWithStudent (Long id);
}
