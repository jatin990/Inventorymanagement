package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.UserRepository;
@Service

public class ProfileService {
	@Autowired
	UserRepository rs;
}
