package com.mouritech.springboot.serviceimpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouritech.springboot.entity.Teacher;
import com.mouritech.springboot.payload.TeacherDto;
import com.mouritech.springboot.repository.TeacherRepository;
@Service
public class TeacherServiceImpl {
	@Autowired
	private TeacherRepository teacherRepository;

	@Autowired
	public ModelMapper mapper;

	public TeacherDto saveTecher(TeacherDto teacherDto) {

		Teacher teacher = dtoToEntity(teacherDto);
		teacherRepository.save(teacher);

		return entityToDto(teacher);
	}

	private Teacher dtoToEntity(TeacherDto teacherDto) {
		Teacher teacher = mapper.map(teacherDto, Teacher.class);
		return teacher;
	}

	private TeacherDto entityToDto(Teacher teacher) {
		TeacherDto studentDto = mapper.map(teacher, TeacherDto.class);
		return studentDto;
	}
}
