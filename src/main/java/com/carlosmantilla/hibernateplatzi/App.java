package com.carlosmantilla.hibernateplatzi;

import java.util.Iterator;
import java.util.List;

import com.carlosmantilla.hibernateplatzi.dao.TeacherDAOImpl;
import com.carlosmantilla.hibernateplatzi.model.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		
		Teacher teacher = new Teacher("Diana Bueno", "URLAVATARCHIQUI");
		TeacherDAOImpl teacherDAOImpl = new TeacherDAOImpl();
		teacherDAOImpl.saveTeacher(teacher);
		
		List <Teacher> teachers =teacherDAOImpl.findAllTeachers();
		
		for (Teacher t : teachers) {
			System.out.println("Nombre: " + t.getName());
		}

		teacher = teacherDAOImpl.findById((long) 3);
		teacher.setName("Diana Bueno Bueno");
		teacherDAOImpl.updateTeacher(teacher);
		

	}
}
