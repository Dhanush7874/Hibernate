package com.emp;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private int age;
	private int phn;
	private String gender;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", phn=" + phn + ", gender=" + gender + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhn() {
		return phn;
	}
	public void setPhn(int phn) {
		this.phn = phn;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
