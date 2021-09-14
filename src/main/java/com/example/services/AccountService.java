package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.users;
import com.example.repository.UserRepository;
@Service
public class AccountService {
	@Autowired
	UserRepository ur;
	public users getAccountDetails(int id) {
		Optional<users> u= ur.findById(id);
		if(u.isPresent()) {
			return u.get();
		}
		return null;
	}
	public users createAccount(users u) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<users> getAccounts() {
		return (List<users>) ur.findAll();
	}

}
