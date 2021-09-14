package com.example.controllers;
import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.wallets;
import com.example.services.WalletService;


@RestController
public class walletController{
	@Autowired
	WalletService ws;
	@RequestMapping(value="/{id}/get-wallet",method=RequestMethod.GET)
	public ResponseEntity<wallets> getWalletDetails(@PathVariable(required=true, value="id") int id){
		return new ResponseEntity<wallets>(ws.getWalletDetails(id),HttpStatus.OK);
	}
	@RequestMapping(value="/{id}/deposit",method=RequestMethod.POST, consumes = {"multipart/form-data"})
	public ResponseEntity<Map<String,wallets>> depositToWallet(@PathVariable(required=true, value="id") int id,float amount){
		return new ResponseEntity<Map<String,wallets>>(Collections.singletonMap("response", ws.depositToWallet(id,amount)),HttpStatus.OK);
	}
	@RequestMapping(value="/{id}/withdraw",method=RequestMethod.POST, consumes = {"multipart/form-data"})
	public ResponseEntity<Map> withdrawFromWallet(@PathVariable(required=true, value="id") int id, float amount){
		float balance=ws.getBalance(id);
		if(balance<amount) {
			return new ResponseEntity<Map>(Collections.singletonMap("response", "Not enough balance to withdraw"),HttpStatus.OK);
		}
		return new ResponseEntity<Map>(Collections.singletonMap("response", ws.withdrawFromWallet(id,amount)),HttpStatus.OK);

	}
}