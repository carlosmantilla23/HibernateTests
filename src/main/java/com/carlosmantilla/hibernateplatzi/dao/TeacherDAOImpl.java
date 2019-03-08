package com.carlosmantilla.hibernateplatzi.dao;

import java.util.List;

import com.carlosmantilla.hibernateplatzi.model.Teacher;

public class TeacherDAOImpl extends PlatziSession implements TeacherDAO {

	private PlatziSession platziSession;
	
	public TeacherDAOImpl() {
		platziSession = new PlatziSession();
	}

	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		platziSession.getSession().persist(teacher); //PERSIST para almacenar
		platziSession.getSession().getTransaction().commit();
	}

	public List<Teacher> findAllTeachers() {
		// TODO Auto-generated method stub
		return platziSession.getSession().createQuery("from Teacher").list();
	}

	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		platziSession.getSession().update(teacher);
		platziSession.getSession().getTransaction().commit();

	}

	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub

	}

	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return platziSession.getSession().load(Teacher.class, idTeacher);
	}

	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
