package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.service.Service_requestService;

@RestController
public class Service_requestController {

	@Autowired
	 private Service_requestService service_requestService;
}
