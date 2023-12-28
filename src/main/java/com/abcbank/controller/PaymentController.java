package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.model.Payment;
import com.abcbank.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/addPayment")
	public Object addPayment(@RequestBody Payment payment) {
		return paymentService.addNewPayment(payment);
	}
	
}
