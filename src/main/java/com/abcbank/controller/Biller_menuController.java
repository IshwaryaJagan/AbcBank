package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.model.Biller_menu;
import com.abcbank.model.Category;
import com.abcbank.model.Customer;
import com.abcbank.service.Biller_menuService;

@RestController
public class Biller_menuController {
 @Autowired
 private Biller_menuService biller_menuService;

 
 @PostMapping("/addNewBiller")
public Object addNewBiller(@RequestBody Biller_menu biller_menu) {
	 return (biller_menuService.biller_menu(biller_menu));
 }
 @GetMapping("/getAllBiller")
 public Object getAllBiller() {
	 return biller_menuService.getAllBiller_menu();
 }
 @PutMapping("/updateBiller")
 public Object updateBiller(@RequestBody Biller_menu biller_menu) {
	 return biller_menuService.updateBiller_menu(biller_menu);
 }
 
}
