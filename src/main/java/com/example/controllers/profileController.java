package com.example.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.services.ItemService;


@RestController
public class profileController{
	@Autowired
	ItemService is;
}