package com.jsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Solution {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Students students=new Students();
		students.setCname("ddd");
		students.setFee(123);
		
		Students students1=new Students();
		students1.setCname("ddd");
		students1.setFee(123);
		
		Course course=new Course();
		course.setNamep("xxx");
		
		Course course1=new Course();
		course1.setNamep("xxx");
	List<Students> s=new ArrayList<Students>()	;
	s.add(students1);
	s.add(students);
	
	List<Course> c=new ArrayList<Course>();
	c.add(course1);
	c.add(course);
	
	students.setCrc(c);
	students1.setCrc(c);
	
	course.setStudent(s);
	course1.setStudent(s);
	
	entityTransaction.begin();
	entityManager.persist( course);
	entityManager.persist(course1);
	entityManager.persist(students);
	entityManager.persist(students1);
	entityTransaction.commit();
		
				
	}

}
