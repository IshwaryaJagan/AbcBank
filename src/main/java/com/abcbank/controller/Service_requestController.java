package com.abcbank.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.DTO.ServiceDTO;
import com.abcbank.service.Service_requestService;

@RestController
public class Service_requestController {

//	@Autowired
//	private Service_requestService serviceRequest;
//	
//	@GetMapping("/fetchRS")
//	public Object getfetch(@RequestBody ServiceDTO dto) {
//		return (serviceRequest.getfetchRequest());
//		
//		
//		
//		 
//	}
//	
}