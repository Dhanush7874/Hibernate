package com.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class Deletedata {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee=entityManager.find(Employee.class,102);
		if(employee!=null)

		{

			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Data already deleted!!!!!!!!!!!!");
		}
	}
	
}


