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
		
		Mobile mobile=new Mobile();
		mobile.setName("redmi");
		mobile.setCost(5000);
		
		Sims sims=new Sims();
		sims.setProviders("Airtel");
		sims.setCharge(300);
		
		Sims sims1=new Sims();
		sims1.setProviders("jio");
		sims1.setCharge(200);
		
		List<Sims> s=new ArrayList<Sims>();
		s.add(sims1);
		s.add(sims);
		sims1.setMob(mobile);
		sims.setMob(mobile);
		mobile.setSims(s);
		
		entityTransaction.begin();
		entityManager.persist(sims1);
		entityManager.persist(sims);
		entityManager.persist(mobile);
		entityTransaction.commit();
		
		
		
	}

}
