package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.model.Chequebook_request;
import com.abcbank.service.Chequebook_requestService;

@RestController
public class Chequebook_requestController {
	@Autowired
	 private Chequebook_requestService chequebook_requestService;
	
	@PostMapping("/savecheque")
	public Object saveCheque(@RequestBody Chequebook_request chequebook_request) {
		return (chequebook_requestService.saveCheque(chequebook_request));	
	}
	
    @GetMapping("/getCard")
    public Object getCard() {
        return (chequebook_requestService.getAllCards());
    }

    @GetMapping("/getbyid/{id}")
    public Object getcardlById(@PathVariable int id) {
        return (chequebook_requestService.getcardById(id));
    }
//
//    @PutMapping("/updatecard/{id}")
//    public Object updateCard(@PathVariable("id")int chequebook_request_id, @RequestBody Chequebook_request chequebookRequest) {
//        return chequebook_requestService.updateCard(chequebookRequest);
//    }


}
