package com.example.mouri.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.mouri.entity.Teacher;
import com.example.mouri.exception.TeacherException;
import com.example.mouri.repository.TeacherRepository;
import com.example.mouri.service.TeacherService;
import com.example.mouri.townvo.ResponseTemplate;
import com.example.mouri.townvo.Student;
@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	private TeacherRepository  teacherRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@Override
	public Teacher saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return teacherRepository.save(teacher);
	}

	@Override
	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return teacherRepository.findAll();
	}

	@Override
	public Teacher getTeacherById(Long id) {
		// TODO Auto-generated method stub
		return teacherRepository.findById(id).orElseThrow(() -> new TeacherException("ID", "id", id));
	}

	@Override
	public Teacher updateTeacher(Teacher teacher, Long id) {
		Teacher teacher2 = teacherRepository.findById(id).orElseThrow(() -> new TeacherException("ID", "id", id));
		
		teacher2.setTeacherName(teacher.getTeacherName());
		teacher2.setTeacherSubject(teacher.getTeacherSubject());
		
		Teacher updateTeacher = teacherRepository.save(teacher);
		
		return updateTeacher;
	}

	@Override
	public void deleteTeacher(Long id) {
		teacherRepository.findById(id).orElseThrow(() -> new TeacherException("ID", "id", id));
		teacherRepository.deleteById(id);
		
	}

	@Override
	public ResponseTemplate getByTeacherWithStudent(Long id) {
		ResponseTemplate responseTemplate = new ResponseTemplate();
		Teacher teacher = teacherRepository.findByTeacherId(id);
		
		Student student= restTemplate.getForObject("http://STUDENT-SERVICE/student/"+
		                                       teacher.getStudentId(),Student.class);
		
		responseTemplate.setStudent(student);
		responseTemplate.setTeacher(teacher);
		return responseTemplate;
	}
	


}
