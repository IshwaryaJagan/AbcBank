package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.model.Category;
import com.abcbank.service.CategoryService;

@RestController
public class CategoryController {
	@Autowired
  private CategoryService categoryService;
  @GetMapping("/getAllCategory")
  public Object getAllCategory() {
	  return categoryService.getAllCategory();
  }
 
}
