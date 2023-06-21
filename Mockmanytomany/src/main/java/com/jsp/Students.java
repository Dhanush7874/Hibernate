package com.jsp;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idp;
private String cname;
private int fee;
@ManyToMany
private List<Course> crc;
public int getIdp() {
	return idp;
}
public void setIdp(int idp) {
	this.idp = idp;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getFee() {
	return fee;
}
public void setFee(int fee) {
	this.fee = fee;
}
public List<Course> getCrc() {
	return crc;
}
public void setCrc(List<Course> crc) {
	this.crc = crc;
}


}