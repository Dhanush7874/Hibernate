package com.hospital.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;	
	private String name;
	private long phnnumber;
	private String email;
	@ManyToOne
	private Hospital hospital;
	@OneToOne
	private Address address;
//	@OneToMany
	private List<Encounter> encounters;
	

}
