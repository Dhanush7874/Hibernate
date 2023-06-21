package com.jsp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String namep;
	@ManyToMany
	private List<Students> student;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNamep() {
		return namep;
	}
	public void setNamep(String namep) {
		this.namep = namep;
	}
	public List<Students> getStudent() {
		return student;
	}
	public void setStudent(List<Students> student) {
		this.student = student;
	}
	
	

}
