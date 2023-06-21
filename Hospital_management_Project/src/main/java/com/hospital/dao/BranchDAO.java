package com.hospital.dao;

import java.util.List;

import com.hospital.dto.Address;
import com.hospital.dto.Branch;

public interface BranchDAO 
{
	public Branch saveBranch(int hid,Branch branch);
	public Branch getBranch(int bid);
	public boolean deleteBranchid(int bid);
	public Branch updateBranch(int bid,Branch branch);
	public List<Branch> getAddressesAll();

}
