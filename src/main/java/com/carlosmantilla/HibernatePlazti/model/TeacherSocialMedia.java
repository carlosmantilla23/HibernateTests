package com.carlosmantilla.HibernatePlazti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_social_media")
public class TeacherSocialMedia implements Serializable {

	@Id
	@Column(name="id_teacher_social_media")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTeacherSocialMedia;
	
	
	private Teacher Teacher;
	
	
	private SocialMedia SocialMedia;
	
	
	public Long getIdTeacherSocialMedia() {
		return idTeacherSocialMedia;
	}
	public void setIdTeacherSocialMedia(Long idTeacherSocialMedia) {
		this.idTeacherSocialMedia = idTeacherSocialMedia;
	}
	public Teacher getTeacher() {
		return Teacher;
	}
	public void setTeacher(Teacher teacher) {
		Teacher = teacher;
	}
	public SocialMedia getSocialMedia() {
		return SocialMedia;
	}
	public void setSocialMedia(SocialMedia socialMedia) {
		SocialMedia = socialMedia;
	}
	public TeacherSocialMedia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeacherSocialMedia(com.carlosmantilla.HibernatePlazti.model.Teacher teacher,
			com.carlosmantilla.HibernatePlazti.model.SocialMedia socialMedia) {
		super();
		Teacher = teacher;
		SocialMedia = socialMedia;
	}
	
	
	
}
