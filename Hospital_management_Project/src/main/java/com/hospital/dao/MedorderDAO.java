package com.hospital.dao;

import java.util.List;

import com.hospital.dto.Medorder;

public interface MedorderDAO {
	
	public Medorder saveMedorder(int eid,Medorder medorder);
	public Medorder getMedorderId(int mid);
	public boolean deleteMedorderId(int mid);
	public Medorder updateMedorder(int mid,Medorder medorder);
public List<Medorder> getAllMedorders();
public List<Medorder> getMedordersbyDoctorsname(String name);

}
