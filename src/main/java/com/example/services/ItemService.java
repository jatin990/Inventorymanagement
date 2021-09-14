package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.items;
import com.example.models.orders;
import com.example.repository.ItemRepository;
import com.example.repository.OrderRepository;
@Service

public class ItemService {
	@Autowired
	ItemRepository ir;
	@Autowired
	OrderRepository or;
	public List<items> getItems() {
		return (List<items>) ir.findAll();
	}
	public orders buyItem(int id, float amount, int account_id) {
		return or.save(new orders());
	}
	public orders sellItem(int id, float amount, int account_id) {
		return or.save(new orders());

	}

}
