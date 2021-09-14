package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.users;
import com.example.services.AccountService;

@RestController
public class AccountController {
	@Autowired
	AccountService as;
	
	
	//createAccount
	@RequestMapping(method=RequestMethod.POST,value="/account")
	public ResponseEntity<users> createAccount(@RequestBody users u){
		return new ResponseEntity<users>(as.createAccount(u),HttpStatus.CREATED);
	}
	//getAccounts
	@RequestMapping(method=RequestMethod.GET,value="/account")
	public ResponseEntity<List<users>> getAccounts(){
		return new ResponseEntity<List<users>>(as.getAccounts(),HttpStatus.OK);
	}
	//getAccount
	@RequestMapping("/account/{id}")
	public users getAccountDetails(@PathVariable(value="id",required=true) Integer id) {
		return as.getAccountDetails(id);
	}

}
