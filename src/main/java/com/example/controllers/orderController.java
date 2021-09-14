package com.example.controllers;

import java.util.List;
import java.util.Scanner;

import com.example.models.orders;
import com.example.services.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class orderController{
	@Autowired
	OrderService os;
	@RequestMapping(value="/{id}/orders", method=RequestMethod.GET)
	public ResponseEntity<List<orders>> displayOrders(@PathVariable(required=true,value="id") int account_id) {
		return new ResponseEntity<List<orders>>(os.getOrders(account_id),HttpStatus.OK);
	}
}