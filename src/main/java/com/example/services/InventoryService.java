package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.orders;
import com.example.repository.InventoryRepository;
@Service

public class InventoryService {
	@Autowired
	InventoryRepository invs;

	public float getAssetQuantity(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void updateInventory(orders o) {
		
	}


}
