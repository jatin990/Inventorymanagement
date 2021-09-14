package com.example.controllers;

import java.util.List;

import com.example.models.items;
import com.example.models.orders;
import com.example.services.InventoryService;
import com.example.services.ItemService;
import com.example.services.WalletService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class itemController{
	@Autowired
	ItemService is;
	@Autowired
	WalletService ws;
	@Autowired
	InventoryService invs;
	@RequestMapping("/items")
	public ResponseEntity<List<items>> getItems() {
		return new ResponseEntity<List<items>>(is.getItems(),HttpStatus.OK);

	}
	//buyItem
	@RequestMapping(method=RequestMethod.POST,value="/buy")
	public ResponseEntity<String> buy(int id, float amount,int account_id) {
		float balance=ws.getBalance(account_id);
		float price=50;
		if(balance>=amount*price) {
			orders o=is.buyItem(id,amount,account_id);
			invs.updateInventory(o);
			ws.updateWalletBalance(o);
			return new ResponseEntity<String>("Successfully bought the item",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Not enough balance",HttpStatus.OK);
	}
	
	//sell item
	@RequestMapping(method=RequestMethod.POST,value="/sell")
	public ResponseEntity<String> sell(int id,float amount,int account_id){
		float balance=invs.getAssetQuantity(id);
		float price=50;
		if(balance*price>=amount) {
			orders o=is.sellItem(id,amount,account_id);
			invs.updateInventory(o);
			ws.updateWalletBalance(o);
			return new ResponseEntity<String>("Successfully sold the item",HttpStatus.OK);
		}
		return new ResponseEntity<String>("Not enough balance in inventory",HttpStatus.OK);
	}
	
}