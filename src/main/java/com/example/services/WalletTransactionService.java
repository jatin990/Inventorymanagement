package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.WalletTransactionRepository;
@Service

public class WalletTransactionService {
	@Autowired
	WalletTransactionRepository rs;
}
