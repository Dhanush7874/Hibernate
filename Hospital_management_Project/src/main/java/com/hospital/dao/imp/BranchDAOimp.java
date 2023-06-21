 package com.hospital.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hospital.dao.BranchDAO;
import com.hospital.dto.Address;
import com.hospital.dto.Branch;
import com.hospital.dto.Hospital;
import com.mysql.cj.Query;

public class BranchDAOimp implements BranchDAO {

	public Branch saveBranch(int hid, Branch branch) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Hospital hospital=entityManager.find(Hospital.class, hid);
		if(hospital!=null)
		{
			
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
			return branch;
		}
		else
		{
			return null;
		}
		
		
		
	}

	public Branch getBranch(int bid) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteBranchid(int bid) {
		// TODO Auto-generated method stub
		return false;
	}

	public Branch updateBranch(int bid, Branch branch) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Branch> getAddressesAll() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		javax.persistence.Query query=entityManager.createQuery("select s from Branch S");
		List<Branch> branch=query.getResultList();
		
		return branch;
	}

}

