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
		
		Students students1=new Students();
		students1.setName("dhanu");
		students1.setCourse("java");
		
		Students students2=new Students();
		students2.setName("Manja");
		students2.setCourse("sql");
		
		College college=new College();
		college.setName("jsp");
		college.setPlace("btr");
		
		List<Students> l=new ArrayList<Students>();
		l.add(students2);
		l.add(students1);
		
		students1.setColleges(college);
		students2.setColleges(college);
		
		college.setStudens(l);
		
		entityTransaction.begin();
		entityManager.persist(college);
		entityManager.persist(students2);
		entityManager.persist(students1);
		entityTransaction.commit();
		
		
		
	}

}
