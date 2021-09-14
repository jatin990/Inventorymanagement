package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.orders;
import com.example.repository.OrderRepository;
@Service

public class OrderService {
	@Autowired
	OrderRepository rs;

	public List<orders> getOrders(int account_id) {
		// TODO Auto-generated method stub
		return null;
	}
}
