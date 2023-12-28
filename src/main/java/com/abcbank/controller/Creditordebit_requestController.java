package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.model.Creditordebit_request;
import com.abcbank.model.Customer;
import com.abcbank.service.Creditordebit_requestService;

@RestController
public class Creditordebit_requestController {
	
	@Autowired
	 private  Creditordebit_requestService  creditordebit_requestService;
	
	@PostMapping("/savecreditordebit")
	public Object saveEmp(@RequestBody Creditordebit_request Creditordebit_request) {
		return (creditordebit_requestService.saveCreditordebit(Creditordebit_request));	
	}
	

	@GetMapping("/getcreditordebit")
	public Object getEmp() {
		return (creditordebit_requestService.getAllCreditordebit_request());
	}
	
	@GetMapping("/getbyid/{CDid}")
	public Object getbyid(@PathVariable int CDid) {
		return (creditordebit_requestService.getbyid(CDid));
		
	}
	
//	@PutMapping("/updatecus/{id}")
//	public Object updatebyid(@PathVariable("id")int credit_debit_request_id,@RequestBody Creditordebit_request cord) {
//		return creditordebit_requestService.updatebyid(credit_debit_request_id,cord);
//		
//		}
}
