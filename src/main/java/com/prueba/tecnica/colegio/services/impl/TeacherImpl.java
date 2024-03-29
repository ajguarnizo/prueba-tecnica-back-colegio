package com.prueba.tecnica.colegio.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.tecnica.colegio.dto.TeacherDTO;
import com.prueba.tecnica.colegio.mapper.ITeacherMapper;
import com.prueba.tecnica.colegio.repository.TeacherRepository;
import com.prueba.tecnica.colegio.service.ITeacherService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TeacherImpl implements ITeacherService{

	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	ITeacherMapper teacherMapper;

	@Override
	public List<TeacherDTO> fetchAllTeacher() {
		List<TeacherDTO> listTeacher = (teacherMapper.toListDto(teacherRepository.findAll()));
		listTeacher.forEach(l -> log.info("List Teacher" + l));
		return listTeacher;
	}
	
}
