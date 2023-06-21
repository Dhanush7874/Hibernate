package com.sim;

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
	
	mobile.setBrand("redmi");
	mobile.setColour("black");
	mobile.setCost(4500);
	mobile.setRam("4gb");
	
	
	Mobile mobile1=new Mobile();
	mobile1.setBrand("iphone");
	mobile1.setColour("white");
	mobile1.setCost(99500);
	mobile1.setRam("8gb");
	
	Sim sim=new Sim();

	sim.setProvider("jio");
	sim.setType("4g");
	sim.setPhno(554564);
	sim.setCost(789);
	
	Sim sim1=new Sim();

	sim1.setProvider("jio");
	sim1.setType("4g");
	sim1.setPhno(554564);
	sim1.setCost(789);
	
	Sim sim2=new Sim();

	sim2.setProvider("jio");
	sim2.setType("4g");
	sim2.setPhno(554564);
	sim2.setCost(789);
	
	Sim sim3=new Sim();

	sim3.setProvider("jio");
	sim3.setType("4g");
	sim3.setPhno(554564);
	sim3.setCost(789);
	
	List<Sim> list =new ArrayList<Sim>();
	list.add(sim);
	list.add(sim1);
	
	List<Sim> list1 =new ArrayList<Sim>();
	list1.add(sim2);
	list1.add(sim3);
	
	
	mobile.setSims(list);
	mobile1.setSims(list1);
	
	sim.setMob(mobile);
	
	
	entityTransaction.begin();
	entityManager.persist(mobile);
	entityManager.persist(mobile1);
	entityManager.persist(sim);
	entityManager.persist(sim1);
	entityManager.persist(sim2);
	entityManager.persist(sim3);
	entityTransaction.commit();
	
	
	
}
}