package com.carlosmantilla.hibernateplatzi.dao;

import java.util.List;

import com.carlosmantilla.hibernateplatzi.model.Teacher;

public interface TeacherDAO {
	
	void saveTeacher (Teacher teacher);
	
	List<Teacher> findAllTeachers();
	
	void updateTeacher (Teacher teacher);
	
	void deleteTeacherById (Long idTeacher);
	
	Teacher findById (Long idTeacher);
	
	Teacher findByName (String name);
 

}
