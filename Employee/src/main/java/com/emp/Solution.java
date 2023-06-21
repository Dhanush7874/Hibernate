package com.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Solution {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Employee employee1=new Employee();
		employee1.setId(102);
		employee1.setName("hanu");
		employee1.setAge(22);
		employee1.setPhn(88888);
		employee1.setGender("male");
		
		Employee employee2=new Employee();
		employee2.setId(103);
		employee2.setName("anu");
		employee2.setAge(22);
		employee2.setPhn(4544);
		employee2.setGender("male");
		
		Employee employee3=new Employee();
		employee3.setId(104);
		employee3.setName("mdhanu");
		employee3.setAge(22);
		employee3.setPhn(84845187);
		employee3.setGender("male");
		
		
		entityTransaction.begin();
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityManager.persist(employee3);
		entityTransaction.commit();

	}

}
