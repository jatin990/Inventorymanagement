package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.orders;
import com.example.models.wallets;
import com.example.repository.WalletRepository;
@Service

public class WalletService {
	@Autowired
	WalletRepository rs;

	public float getBalance(int account_id) {
		return rs.findWalletbyAccountId(account_id).getAmount();		
	}

	public wallets getWalletDetails(int id) {
		return null;
	}

	public wallets depositToWallet(int id, float amount) {
		return null;
	}

	public wallets withdrawFromWallet(int id, float amount) {
		return null;
	}

	public void updateWalletBalance(orders o) {
		
	}
}
