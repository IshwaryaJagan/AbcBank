package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.DTO.StolenDTO;
import com.abcbank.service.Lostorstolen_requestService;

@RestController
public class Lostorstolen_requestController {

	@Autowired
	private Lostorstolen_requestService lostorstolen;
	
	@GetMapping("/fetchLost")
	public Object getalldetails() {
		return (lostorstolen.getalldetails());
	}
	
	@GetMapping("/fetchByIdStolen/{id}")
	public Object getById(@PathVariable("id")int lost_stolen_request_id) {
		return (lostorstolen.getById(lost_stolen_request_id));
	}
	
	@PutMapping("/updateStolen")
	public Object updateById(@RequestBody StolenDTO dto) {
		return (lostorstolen.updateById(dto));
		
	}
	
}
