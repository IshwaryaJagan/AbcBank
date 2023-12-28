package com.abcbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcbank.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
    private PaymentService paymentService;
@GetMapping("/getAllPayment")
public Object getAllPayment() {
	return paymentService.getAllPayment();
}
}
