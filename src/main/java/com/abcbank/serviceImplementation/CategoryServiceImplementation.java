package com.abcbank.serviceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.repository.CategoryRepo;
import com.abcbank.service.CategoryService;

@Service
public class CategoryServiceImplementation implements CategoryService{

	@Autowired
	private CategoryRepo categoryRepo;
	
}
