package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.DTO.CreditorDebitDTO;
import com.abcbank.service.Creditordebit_requestService;

@RestController
public class Creditordebit_requestController {

	@Autowired
	private Creditordebit_requestService creditorDebitRequest;
	
	@GetMapping("/fetch")
	public  Object getAlldetails() {
		return (creditorDebitRequest.getAlldetails());
		
	}
	@GetMapping("/fetchbyid/{id}")
	public Object getById(@PathVariable("id")int credit_debit_request_id) {
		return (creditorDebitRequest.getById(credit_debit_request_id));
		
	}
	
	@PutMapping("/updateCredit")
	public Object updateById(@RequestBody CreditorDebitDTO cbDTO) {
		return (creditorDebitRequest.updateById(cbDTO));
		
	}
}
