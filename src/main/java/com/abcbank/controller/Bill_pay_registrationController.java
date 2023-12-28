package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.model.Bill_pay_registration;
import com.abcbank.model.Customer;
import com.abcbank.service.Bill_pay_registrationService;

@RestController
public class Bill_pay_registrationController {
	
	@Autowired
	private Bill_pay_registrationService bill_pay_registrationService;
	
	@GetMapping("/getcustname/{custId}")
	public Object getcustname(@PathVariable int custId) {
		return bill_pay_registrationService.getCustomerNameById(custId);
	}
	
//	@GetMapping("/getaccount")
//	public Object getaccount(@PathVariable int custId) {
//		return bill_pay_registrationService.getAccountById(custId);
//	}
	
	@PostMapping()
	public Object postReg(@RequestBody Customer customer) {
		return bill_pay_registrationService.saveCustomerAccount(customer);
	}
	
	
	
}
