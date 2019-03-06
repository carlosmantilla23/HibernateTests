package com.carlosmantilla.HibernatePlazti.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher")
public class Teacher implements Serializable {
	
	@Id
	@Column(name="id_teacher")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTeacher;
	
	@Column(name="name")
	private String name;
	
	@Column(name="avatar")
	private String avatar;
	private Set<Course> courses;
	private Set<Teacher> TeacherSocialMedias;
	
	public Long getIdTeacher() {
		return idTeacher;
	}
	public void setIdTeacher(Long idTeacher) {
		this.idTeacher = idTeacher;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name, String avatar) {
		super();
		this.name = name;
		this.avatar = avatar;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	public Set<Teacher> getTeacherSocialMedias() {
		return TeacherSocialMedias;
	}
	public void setTeacherSocialMedias(Set<Teacher> teacherSocialMedias) {
		TeacherSocialMedias = teacherSocialMedias;
	}
	
	

}
