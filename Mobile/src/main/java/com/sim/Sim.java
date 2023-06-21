package com.sim;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Sim {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String provider;
	private String type;
	private double phno;
	private int cost;
	@OneToMany
	private Mobile mob;
	public Mobile getMob() {
		return mob;
	}
	public void setMob(Mobile mob) {
		this.mob = mob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPhno() {
		return phno;
	}
	public void setPhno(double phno) {
		this.phno = phno;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
