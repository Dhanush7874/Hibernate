package com.hospital.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital.dao.HospitalDAO;
import com.hospital.dto.Hospital;

public class HospitalDaoImp implements HospitalDAO{

	public Hospital saveHospital(Hospital hospital) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		
		return hospital;
		
	}

	public Hospital getHospitalById(int hid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Hospital hospital= entityManager.find(Hospital.class, hid);
		return hospital;
	}

	public boolean deleteHospitalId(int hid) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital=entityManager.find(Hospital.class, hid);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public Hospital updateHospitalByid(int hid, Hospital hospital) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital1=entityManager.find(Hospital.class, hid);
		if(hospital!=null)
		{
			hospital.setName(hospital.getName());
			hospital.setWebsite(hospital.getWebsite());
//			hospital.setBranches(hospital.getBranches());
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return hospital1;
		}
		return null;
	}

}
