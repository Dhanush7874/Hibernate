package com.jsp.adhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Deletedata {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=entityManager.find(Person.class,2);
		if(person!=null)
		{
			
		
		entityTransaction.begin();
		entityManager.remove(person);
		entityTransaction.commit();
		}
		else
		{
			System.out.println("data is alreadt deleted");
		}

}

}
