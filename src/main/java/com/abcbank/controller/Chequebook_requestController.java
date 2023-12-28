package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.DTO.ChequeDTO;
import com.abcbank.model.Chequebook_request;
import com.abcbank.service.Chequebook_requestService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class Chequebook_requestController {

	@Autowired
	private Chequebook_requestService chequeBookRequestService;
	
	@GetMapping("/getAllChequebookreq")
	public Object getChequeBookRequest() {
		return (chequeBookRequestService.getAllChequeBookRequest());
	}
	
	@GetMapping("/getchequebookreqid/{id}")
	public Object getChequeBookRequestbyid(@PathVariable("id")int chequebook_request_id) {
		return (chequeBookRequestService.getChequeBookRequestid(chequebook_request_id));
	}
	
	@PutMapping("/updateCheque")
	public Object updateById(@RequestBody ChequeDTO chequeBookRequest) {
		return (chequeBookRequestService.updateById(chequeBookRequest));
	}
	
}
