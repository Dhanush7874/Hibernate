package bidrction;

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
		person.setName("Manju");
		person.setAge(23);
		person.setAddress("dtd");
		
		Person person1=new Person();
		person1.setName("Manju");
		person1.setAge(23);
		person1.setAddress("dtd");
		
		Adhar adhar=new Adhar();
		adhar.setName("nnn");
		adhar.setNum(6454);
		
		Adhar adhar1=new Adhar();
		adhar1.setName("nnn");
		adhar1.setNum(6454);
		
		person.setPannumber(adhar);
		person1.setPannumber(adhar1);
		
		adhar.setPer(person);
		adhar1.setPer(person1);
		entityTransaction.begin();
		
		
		
entityManager.persist(adhar);
entityManager.persist(adhar1);
entityManager.persist(person);
entityManager.persist(person1);
entityTransaction.commit();

		
		
	}

}
