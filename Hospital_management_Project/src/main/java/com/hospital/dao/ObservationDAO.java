package com.hospital.dao;

import java.util.List;

import com.hospital.dto.Observation;

public interface ObservationDAO {
	public Observation saveObservation(int eid,Observation observation);
	public Observation getObservationid(int oid);
	public boolean deleteObservationid(int oid);
	public Observation updateObservation(int oid,Observation observation);
public List<Observation> getAllObservations();
public List<Observation> getObservationsbyDocctorsname(String name);
}
