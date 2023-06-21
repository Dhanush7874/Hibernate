package com.hospital.dao;

import java.util.List;

import com.hospital.dto.Encounter;

public interface EncounterDAO {
	
	public Encounter saveEncounter(int bid,Encounter encounter);
	public Encounter getEncounterId(int eid);
	public boolean deleteEncounterId(int hid);
	public Encounter updateEncounter(int eid,Encounter encounter);
 public List<Encounter> getAllEncounters();
}
