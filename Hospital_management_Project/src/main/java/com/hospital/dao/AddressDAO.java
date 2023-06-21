package com.hospital.dao;

import com.hospital.dto.Address;

public interface AddressDAO {
	public Address saveadreAddress(int bid,Address address);
	public Address getAddress(int aid);
	public boolean deleteadressid(int aid);
	public Address updateAddress(int hid,Address address);

}
