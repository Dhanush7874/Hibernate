package com.hospital.dao;

import java.util.List;

import com.hospital.dto.Item;

public interface ItemDAO {
	public Item saveItem(int mid,Item item);
	public Item getItemId(int iid);
	public boolean deleteItemId(int id);
	public Item updateItem(int iid,Item item);
	public List<Item> getAllItems();
}
