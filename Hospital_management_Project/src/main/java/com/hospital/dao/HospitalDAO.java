package com.hospital.dao;

import com.hospital.dto.Hospital;

public interface HospitalDAO {
	public Hospital saveHospital(Hospital hospital);
	public Hospital getHospitalById(int hid);
	public boolean deleteHospitalId(int hid);
	public Hospital updateHospitalByid(int hid,Hospital hospital);

}
