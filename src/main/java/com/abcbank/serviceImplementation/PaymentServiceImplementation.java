package com.abcbank.serviceImplementation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcbank.model.Payment;
import com.abcbank.repository.PaymentRepo;
import com.abcbank.service.PaymentService;
@Service
public class PaymentServiceImplementation implements PaymentService {
@Autowired
private PaymentRepo paymentRepo;
	@Override
	public Object getAllPayment() {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		
		List<Payment> payment = paymentRepo.findAll();
		for(Payment c: payment) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("Date",LocalDate.now()); 
map.put("Biller", c.getBiller_menu().getBiller_name());
map.put("Account_No",c.getBiller_menu().getBiller_account_no());

map.put("Amount",c.getBill_amount());
map.put("Cetogory",c.getBiller_menu().getCategory().getCategory_desc());
map.put("Payment Date",c.getPayment_date());
list.add(map);
		}
		
		return list;
	}

}
