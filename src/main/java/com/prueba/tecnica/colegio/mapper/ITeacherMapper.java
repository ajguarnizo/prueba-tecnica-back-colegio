package com.prueba.tecnica.colegio.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import com.prueba.tecnica.colegio.dto.TeacherDTO;
import com.prueba.tecnica.colegio.entity.Teacher;

@Component
@Mapper(componentModel = "spring")
public interface ITeacherMapper {
	
	List<TeacherDTO> toListDto(List<Teacher> teacher);

}
