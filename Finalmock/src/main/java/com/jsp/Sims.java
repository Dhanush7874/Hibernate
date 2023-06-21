package com.jsp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Sims {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String providers;
	private int charge;
	@ManyToOne
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
	public String getProviders() {
		return providers;
	}
	public void setProviders(String providers) {
		this.providers = providers;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	

}
