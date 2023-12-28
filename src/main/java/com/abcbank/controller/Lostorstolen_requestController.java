package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.model.Lostorstolen_request;
import com.abcbank.service.Lostorstolen_requestService;

@RestController
public class Lostorstolen_requestController {
	
	    @Autowired
	    private Lostorstolen_requestService lostorstolen_requestService  ;

	    @PostMapping("/saverequ")
	    public Object saveRequ(@RequestBody Lostorstolen_request lostorstolen_request) {
	        return (lostorstolen_requestService.saveRequ(lostorstolen_request));
	    }

	    @GetMapping("/getrequ")
	    public Object getRequ() {
	        return (lostorstolen_requestService.getAllRequ());
	    }

	    @GetMapping("/getrequById/{id}")
	    public Object getrequById(@PathVariable int id) {
	        return (lostorstolen_requestService.getrequById(id));
	    }

	

}
