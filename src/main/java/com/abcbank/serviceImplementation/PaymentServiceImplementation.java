package com.abcbank.serviceImplementation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.Payment;
import com.abcbank.repository.PaymentRepo;
import com.abcbank.service.PaymentService;

@Service
public class PaymentServiceImplementation implements PaymentService{

	@Autowired
	private PaymentRepo paymentRepo;

	@Override
	public Object addNewPayment(Payment payment) {
		Map<String, Object> map = new HashMap<String, Object>();
		
		if(payment.getBill_amount() == 0.0) {
			map.put("status", "error");
			map.put("msg", "Please Enter Biller Amount");
		}
		
		else if(payment.getPayment_due_date() == null) {
			map.put("status", "error");
			map.put("msg", "Please Enter the due date");
		}
		
		else {
			paymentRepo.save(payment);
			map.put("status", "success");
			map.put("msg", "Payment data saved succssfully.");
		}
		
		return map;
	}
	
}
