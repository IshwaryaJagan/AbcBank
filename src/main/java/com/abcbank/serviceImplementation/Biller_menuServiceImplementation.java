package com.abcbank.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.repository.Biller_menuRepo;
import com.abcbank.service.Biller_menuService;

@Service
public class Biller_menuServiceImplementation implements Biller_menuService{

	@Autowired
	private Biller_menuRepo biller_menuRepo;
	
}
