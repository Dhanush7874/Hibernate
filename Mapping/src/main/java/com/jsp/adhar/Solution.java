package com.jsp.adhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Solution {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();

		person.setName("Dhanush");
		person.setAge(23);
		person.setPhn(86180578);
		
		
		AdharCard adharCard=new AdharCard();

		adharCard.setAdharnumber(61303898);
		adharCard.setAddress("mysore");
		person.setAdhar(adharCard);
		

		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(adharCard);
		entityTransaction.commit();
	
}
}
