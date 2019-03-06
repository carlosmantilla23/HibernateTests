package com.carlosmantilla.HibernatePlazti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course implements Serializable {
	
	@Id
	@Column(name="id_course")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCourse;
	
	@Column(name="name")
	private String name;
	
	@Column(name="themes")
	private String themes;
	
	@Column(name="project")
	private String project;
	
	
	private Teacher idTeacher;
	
	public Long getIdCourse() {
		return idCourse;
	}
	public void setIdCourse(Long idCourse) {
		this.idCourse = idCourse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTheme() {
		return themes;
	}
	public void setTheme(String theme) {
		this.themes = theme;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Teacher getIdTeacher() {
		return idTeacher;
	}
	public void setIdTeacher(Teacher idTeacher) {
		this.idTeacher = idTeacher;
	}
	public Course(String name, String theme, String project, Teacher idTeacher) {
		super();
		this.name = name;
		this.theme = theme;
		this.project = project;
		this.idTeacher = idTeacher;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
